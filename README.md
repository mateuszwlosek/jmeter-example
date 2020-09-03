# JMeter - Example

Example of [JMeter](https://jmeter.apache.org/) usage.

Test service was developed in [Spring Boot](https://projects.spring.io/spring-boot/).  
I used also [MongoDB](https://www.mongodb.com/) in test-service to make the test slightly more complex.

## JMeter
I created only one test, that invokes an endpoint, which creates new documents in database checks if endpoint responds in time with 200 HTTP code.  
This test simulates 100 users.  
I created one profile: local, but it is easly possible to add more profiles in pom.xml and then use different profiles without a need to create separate tests for different environments.  
A service that executes JMeter tests is not in Dockerfile as this is easier to invoke those tests adhoc from console without docker.

## How to run the test

### Before you start
* Make sure you have `Docker`, `docker-compose` , `maven` and `Java 11` installed.

[Docker CE INSTALLATION](https://docs.docker.com/install/linux/docker-ce/ubuntu/)  
[Docker Compose INSTALLATION](https://docs.docker.com/compose/install/#prerequisites)  
[Maven Installation](https://maven.apache.org/install.html)  
[Java 11 Installation](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)  
[JMeter Installation (Optional, for tests modification)](http://jmeter.apache.org/download_jmeter.cgi)

### Start the environment
1. Build services:
    `docker-compose build`
2. Run services:
    `docker-compose up`
3. Execute tests:
    `mvn clean verify` - in `jmeter-test-executor` directory  
    Results of the test should appear in `jmeter-test-executor/src/main/resources`
