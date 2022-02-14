# Spring Cloud Eureka server

Examples of microservice tracing 

This project contains examples of microservice service discovery with eureka, implemented with Spring Boot and Spring Cloud projects. 

# softwares
   1. java 8
   2. maven
   3. intellij idea
   
  # - History
 ```
 - Config Server: use local or git
 - Integrate with Eureka Service
 - Order service
 - Inventory service
 ```

### Overview
- configserver: Load all configs for services via port 8888

- eurekaserver: Run service via port 8761

- order-service: Run service via port 7172

- inventory-service: Run service via port 7171

 # - build the projects

 - ConfigServer: 
 ```
   cd configserver
   mvn clean install -DskipTests
   mvn spring-boot:run
 ```
 - Eureka Server: 
 ```
   cd eurekaserver
   mvn clean install -DskipTests
   mvn spring-boot:run
 ```
 - order Service: 
 ```
   cd order-service
   mvn clean install -DskipTests
   mvn spring-boot:run
 ```
  - inventory Service: 
 ```
   cd inventory-service
   mvn clean install -DskipTests
   mvn spring-boot:run
 ```
 
### Eureka server :

![This is an image](https://github.com/Apallapu/microservice-workshop/blob/master/week-1/lab-7/images/eureka.PNG)


### Order service swagger ui :

![This is an image](https://github.com/Apallapu/microservice-workshop/blob/master/week-1/lab-7/images/order-swagger.PNG)

### Inventory service swagger ui :

![This is an image](https://github.com/Apallapu/microservice-workshop/blob/master/week-1/lab-7/images/inventory-swagger.PNG)

 
 
