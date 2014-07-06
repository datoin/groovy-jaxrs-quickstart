Groovy JAXRS Quick Start:
------------------------

This project is a template project(maven archetype) for Qu(k)ick starting RESTful 
 services server in groovy (which plays on top of java tools).

##This templates includes:
. Groovy and java compilation together, you are free to choose the one you love
. Jersey Configuration for JAX-RS Server (Jersey 2.x)
. Jackson configuration for automatic pojo to JSON conversion
. Jersey configuration for support for multi part 
. Jetty plugin configuration for easy and agile development.
       You are just "mvn jetty:run" away from starting server
. Jersey test framework core configuration and special configuration for jetty container
. Spock configuration to ease writing tests
. junit 4.x configured, in case you choose to write tests in java
. Sample Classes for Resources, Services and Tests at respective places to guide through examples


## How to make use of this template:

###Install this archetype to your local maven repository
  Pull this repository, and run `mvn clean install`
  This should install `org.datoin.maven:groovy-jaxrs-quickstart` 

### Create a new project
   Run `mvn archeType:generate` and choose `org.datoin.maven:groovy-jaxrs-quickstart` 
   archetype. You are good to start after issuing artifactId, groupId
   and version for your new project

### To run server
   `mvn compile jetty:run`
 
