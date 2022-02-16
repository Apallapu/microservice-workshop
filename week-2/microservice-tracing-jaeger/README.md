# microservice with with Jaeger tracing

Examples of microservice tracing 

This project contains examples of microservice tracing with Jaeger implemented with Spring Boot and Spring Cloud projects. 

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
 - Integrate Jaeger
 ```

### Overview
- configserver: Load all configs for services via port 8888

- eurekaserver: Run service via port 8761

- order-service: Run service via port 7172

- inventory-service: Run service via port 7171

- Jaeger: Run service via port 16686
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
 
  - docker commands: 
 ```
   cd configserver
  mvn clean install -DskipTests
  docker build . -t ankammapallapu/configserver
  cd eurekaserver
  mvn clean install -DskipTests
  docker build . -t ankammapallapu/eurekaserver
  cd order-service
  mvn clean install -DskipTests
  docker build . -t ankammapallapu/order
  cd invenotry-service
  mvn clean install -DskipTests
  docker build . -t ankammapallapu/inventory
  cd gatewayserver
  mvn clean install -DskipTests
  docker build . -t ankammapallapu/gatewayserver
  
  docker-compose up
  docker ps -a
  docker-compose down
 ```
 
 
### Eureka server :

![This is an image](https://github.com/Apallapu/microservice-workshop/blob/master/week-1/lab-7/images/eureka.PNG)

### Gateway swagger ui :

![This is an image](https://github.com/Apallapu/microservice-workshop/blob/master/week-1/lab-7/images/gateway-swagger.PNG)

### Order service swagger ui :

![This is an image](https://github.com/Apallapu/microservice-workshop/blob/master/week-1/lab-7/images/order-swagger.PNG)

### Inventory service swagger ui :

![This is an image](https://github.com/Apallapu/microservice-workshop/blob/master/week-1/lab-7/images/inventory-swagger.PNG)

### Jaeger tracing ui with Order service :

![This is an image](https://github.com/Apallapu/microservice-workshop/blob/master/week-2/microservice-tracing-jaeger/images/jaeger-1.PNG)
![This is an image](https://github.com/Apallapu/microservice-workshop/blob/master/week-2/microservice-tracing-jaeger/images/jaeger-2.PNG)

### Jaeger tracing ui with Inventory service :

![This is an image](https://github.com/Apallapu/microservice-workshop/blob/master/week-2/microservice-tracing-jaeger/images/jaeger-3.PNG)

![This is an image](https://github.com/Apallapu/microservice-workshop/blob/master/week-2/microservice-tracing-jaeger/images/jaeger-4.PNG)

 
 
 
