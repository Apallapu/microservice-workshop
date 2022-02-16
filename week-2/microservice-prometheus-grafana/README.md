# Microservice with Prometheus and Grafana


Examples of microservice metics with Prometheus and Grafana

This project contains examples of microservice metics with Prometheus and Grafana. 

# softwares
   1. java 8
   2. maven
   3. intellij idea
   4. dockerdesktop
   
  # - History
 ```
 - Config Server: use local or git
 - Integrate with Eureka Service
 - Integrate with Gateway Service
 - Order service
 - Inventory service
 - Integrate Prometheus
 - Integrate Grafana
 ```

### Overview
- configserver: Load all configs for services via port 8888

- eurekaserver: Run service via port 8761

- order-service: Run service via port 7172

- inventory-service: Run service via port 7171

- Prometheus: Run service via port 9090
- Grafana: Run service via port 3000
- gateway-service Run service via port 7575

 # - build the projects

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
 
```
 Prometheus Dashboards URL : http://localhost:9090/targets/ 
 Grafana Dashboards URL : http://localhost:3000/login/  
```
 
### Grafana Dashboards :

![This is an image](https://github.com/Apallapu/microservice-workshop/blob/master/week-2/microservice-prometheus-grafana/images/Grafana-01.PNG)
-order service dash bords
![This is an image](https://github.com/Apallapu/microservice-workshop/blob/master/week-2/microservice-prometheus-grafana/images/Grafana-order-01.PNG)
![This is an image](https://https://github.com/Apallapu/microservice-workshop/blob/master/week-2/microservice-prometheus-grafana/images/Grafana-order-02.PNG)

-JVM Dashboards
![This is an image](https://github.com/Apallapu/microservice-workshop/blob/master/week-2/microservice-prometheus-grafana/images/Grafana-jvm-01.PNG)
![This is an image](https://github.com/Apallapu/microservice-workshop/blob/master/week-2/microservice-prometheus-grafana/images/Grafana-jvm-02.PNG)

### Prometheus Dashboards:

![This is an image](https://github.com/Apallapu/microservice-workshop/blob/master/week-2/microservice-prometheus-grafana/images/prometheus-01.PNG)

![This is an image](https://github.com/Apallapu/microservice-workshop/blob/master/week-2/microservice-prometheus-grafana/images/prometheus-02.PNG)

![This is an image](https://github.com/Apallapu/microservice-workshop/blob/master/week-2/microservice-prometheus-grafana/images/prometheus-03.PNG)

- prometheus.yml
```
global:
  scrape_interval:     5s # Set the scrape interval to every 5 seconds.
  evaluation_interval: 5s # Evaluate rules every 5 seconds.
scrape_configs:
  - job_name: 'order'
    metrics_path: '/actuator/prometheus'
    static_configs:
      - targets: ['order:7172']
  - job_name: 'inventory'
    metrics_path: '/actuator/prometheus'
    static_configs:
      - targets: ['inventory:7171']
```
- docker important commands
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


 
 
 
