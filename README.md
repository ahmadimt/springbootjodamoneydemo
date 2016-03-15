# Spring Boot Jodamoney demo
This application shows how to read exchange rate from a CSV file and use it for converting money in different currencies.

## Pre-requisite
1. Java(JDK 8)
2. Gradle

## Running the application
1. Download the zip or clone the repository.
2. Go to root of the project.
3. Specify the location of the CSV containing the exchange rate in ```application.properties```.
4. Open a terminal or command prompt and run the below command:

  for Linux users:
    ```./gradlew clean bootRun```
  for Windows users:
    ```gradlew.bat clean bootRun```
