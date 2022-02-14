# Spring Cloud Gateway

Examples of microservice Spring Cloud Gateway

This project contains examples of microservice Spring Cloud Gateway , implemented with Spring Boot and Spring Cloud projects. 

# softwares
   1. java 8
   2. maven
   3. intellij idea
   
  # - History
 ```
 - Config Server: use local or git
 - Integrate with Eureka Service
 - Integrate with Gateway Service
 - Order service
 - Inventory service
 ```

### Overview
- configserver: Load all configs for services via port 8888

- eurekaserver: Run service via port 8761

- order-service: Run service via port 7172

- inventory-service: Run service via port 7171
- gateway-service Run service via port 7575

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
  - gateway Service: 
 ```
   cd gateway-service
   mvn clean install -DskipTests
   mvn spring-boot:run
 ```
 
 
### Eureka server :

![This is an image](https://github.com/Apallapu/microservice-workshop/blob/master/week-1/lab-7/images/eureka.PNG)

### Gateway swagger ui :

![This is an image](https://github.com/Apallapu/microservice-workshop/blob/master/week-1/lab-7/images/gateway-swagger.PNG)

### Order service swagger ui :

![This is an image](https://github.com/Apallapu/microservice-workshop/blob/master/week-1/lab-7/images/order-swagger.PNG)

### Inventory service swagger ui :

![This is an image](https://github.com/Apallapu/microservice-workshop/blob/master/week-1/lab-7/images/inventory-swagger.PNG)



 
 
 
