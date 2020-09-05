# Introduction
[ Forked from DropWizard template]

The Dropwizard example application was developed to, as its name implies, provide examples of some of the features
present in Dropwizard.

This version has the following customization:
* dropwizard uses port 8088 so that graphite can have 8080
* Postgresql for automated integration tests and production operation (instead of mysql)
* docker-compose that includes graphite and grafana
* Swagger to generate API docs

# Overview

Included with this repository is:
	- Hibernate + Postgres, includes integration testing against Postgres
	- Grafana and Graphite containers for metrics in dev
	- Swagger API
## Hibernate ORM
The examples provided illustrate a few of the features available in [Hibernate](http://hibernate.org/), 
along with demonstrating how these are used from within Dropwizard.

This database example is comprised of the following classes:

* The `PersonDAO` illustrates using the Data Access Object pattern with assisting of Hibernate.

* The `Person` illustrates mapping of Java classes to database tables with assisting of JPA annotations.

* All the JPQL statements for use in the `PersonDAO` are located in the `Person` class.

* `migrations.yml` illustrates the usage of `dropwizard-migrations` which can create your database prior to running
your application for the first time.

* The `PersonResource` and `PeopleResource` are the REST resource which use the PersonDAO to retrieve data from the database, note the injection
of the PersonDAO in their constructors.

As with all the modules the db example is wired up in the `initialize` function of the `HelloWorldApplication`.

# Running The Application

To test the example application run the following commands.

* To build the dev-environment with docker-compose:
		docker-compose up

* To run the server run.

        java -jar target/dropwizard-example-$DW_VERSION.jar server example.yml

* To hit the Hello World example (hit refresh a few times).

	http://localhost:8088/hello-world

* To post data into the application.

	curl -H "Content-Type: application/json" -X POST -d '{"fullName":"Other Person","jobTitle":"Other Title"}' http://localhost:8088/people
	
	open http://localhost:8088/people

# Operations

* to check graphite for data

	open http://localhost:8080/

* To check grafana for data

	open http://localhost:3000/
	user: admin
	pw: admin

* To see Swagger spec

    open http://localhost:8088/openapi.json

