# Time Zone Converter

### A simple Java application to convert time between different time zones.

---

## Table of Contents
- [Project Overview](#project-overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
---

## Project Overview

**Time Zone Converter** is a Java-based console application that allows users to convert time from one time zone to another. The application leverages Java’s built-in `java.time` package, making it efficient and easy to use. Whether you're planning a meeting across different time zones or simply want to know the current time elsewhere, this tool will simplify the process.

---

## Features

- Convert time between any two time zones using standard time zone identifiers.
- Handle various formats of date-time input.
- Support for Daylight Saving Time (DST) transitions.
- Accurate conversion based on time zone rules.
- Output in human-readable formats.

---

## Technologies Used

- **Java 8 or higher**: Core development language.
- **java.time package**: Built-in Java API for date and time manipulation.
- **Maven** (optional): For dependency management.

---

## Installation

### Prerequisites

1. Ensure you have **Java 8** or later installed on your system.
   - You can verify your installation by running:
     ```bash
     java -version
     ```

2. Optionally, install **Maven** if you plan to manage dependencies using a build tool.

### Clone the Repository

```bash
git clone https://github.com/your-username/time-zone-converter.git
cd time-zone-converter
### Compile and Run
  If you're using Maven:
  mvn compile
  mvn exec:java -Dexec.mainClass="com.example.TimeZoneConverter"
Otherwise, you can compile and run manually:
javac src/com/example/TimeZoneConverter.java
java src/com/example/TimeZoneConverter



