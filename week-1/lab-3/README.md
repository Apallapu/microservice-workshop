# Spring Cloud config server

Examples of config server 

This project contains examples of config server. 

# softwares
   1. java 8
   2. maven
   3. intellij idea
   
  # - History
 ```
 - Config Server: use local or git
 - Order service
 - Inventory service
 ```

### Overview
- configserver: Load all configs for services via port 8888

- order-service: Run service via port 7172

- inventory-service: Run service via port 7171

 # - build the projects

 - ConfigServer: 
 ```
   cd configserver
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
 
 -config server
 ```
 http://localhost:8888/order/default
 http://localhost:8888/order/dev
 http://localhost:8888/order/prod
 http://localhost:8888/inventory/prod
 http://localhost:8888/inventory/dev
 http://localhost:8888/inventory/default
 ```

### Order service swagger ui :

![This is an image](https://github.com/Apallapu/microservice-workshop/blob/master/week-1/lab-7/images/order-swagger.PNG)

### Inventory service swagger ui :

![This is an image](https://github.com/Apallapu/microservice-workshop/blob/master/week-1/lab-7/images/inventory-swagger.PNG)



 
 
 
