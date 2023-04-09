import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeZoneConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Show all possible time zones
        System.out.println("All available time zones:");
        try (BufferedReader br = new BufferedReader(new FileReader("/usr/share/zoneinfo/zone.tab"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\t");
                System.out.println("- " + parts[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Get the user's input for the country time zone
        System.out.print("\nEnter the country time zone (e.g. Asia/Kolkata): ");
        String countryTimeZone = scanner.nextLine();

        // Calculate the time difference between the local time zone and the country time zone
        LocalDateTime localDateTime = LocalDateTime.now();
        int localOffsetInMinutes = localDateTime.getMinute() + localDateTime.getHour() * 60;
        int countryOffsetInMinutes = Integer.parseInt(countryTimeZone.substring(countryTimeZone.lastIndexOf("/") + 1));
        int timeDiffInMinutes = countryOffsetInMinutes - localOffsetInMinutes;
        int timeDiffInHours = timeDiffInMinutes / 60;
        timeDiffInMinutes = timeDiffInMinutes % 60;

        // Calculate the time in the country time zone
        LocalDateTime countryDateTime = localDateTime.plusHours(timeDiffInHours).plusMinutes(timeDiffInMinutes);

        // Format the country time zone date and time and print it
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedCountryDateTime = countryDateTime.format(formatter);
        System.out.println("The current date and time in " + countryTimeZone + " is: " + formattedCountryDateTime);
    }
}
