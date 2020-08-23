#!/bin/bash
mvn clean install
java -jar target/machete-1.0-SNAPSHOT.jar server machete.yml

