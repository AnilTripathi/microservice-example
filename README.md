# Spring MicroServices
 Learn how to create awesome Microservices and RESTful web services with Spring and Spring Boot.


### Introduction


### Expectations
- You should know Java and Spring. 
- A basic understanding of developing web applications is a bonus but NOT mandatory. 
- A basic understanding of Spring Boot is a bonus but NOT mandatory. We have seperate section to introduce Spring Boot.
- A basic understanding of JPA is a bonus but NOT mandatory. We have seperate section to introduce JPA.
- You are NOT expected to have any experience with Eclipse, Maven or Tomcat.
- We will help you install Eclipse and get up and running with Maven and Tomcat.

## Required tools
- Java 8 pre insalled
- Maven pre insalled
- Eclipse & Embedded Maven OR Spring STS
- PostMan


## Running Examples
- Download the zip or clone the Git repository.
- Unzip the zip file (if you downloaded one)
- Open Command Prompt and Change directory (cd) to folder containing pom.xml
- Open Eclipse 
   - File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip
   - Select the right project
- Choose the Spring Boot Application file (search for @SpringBootApplication)
- Right Click on the file and Run as Java Application

### Running sequence
     1. RUN eureka-server application [URL : http://localhost:8010]
     2. RUN cloud-confir application  [URL : http://localhost:8090/api/dservice/rest/hello]
     3. RUN db-service application
     4. RUN gateway-server application
     5. To refresh the changes hit the following URL With Header "Content-Type: application/json" and blank body
         http://localhost:8090/api/dservice/actuator/refresh
