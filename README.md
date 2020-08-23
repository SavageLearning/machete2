# MacheteV2


### Prerequisites
(On MacOS)

1. Install Java: https://www.java.com/en/download/mac_download.jsp
1. Install JDK: https://www.oracle.com/java/technologies/javase-downloads.html
1. Install Homebrew: https://brew.sh/
1. Install Maven: `brew install maven` or https://maven.apache.org/download.cgi

<hr />

### How to start the application

Clone this repo:
```
git clone git@github.com:SavageLearning/machete2
```

Navigate to the directory:
```
cd machete2
```

Run a Maven install to build the application:
```
mvn clean install
```

Start the application:
```
java -jar target/machete-1.0-SNAPSHOT.jar server machete.yml
```

To check that your application is running enter this URL in your browser: 

http://localhost:8080

<hr />

### Health Check

To see your application's health enter the following URL in your browser: 

http://localhost:8081/healthcheck
