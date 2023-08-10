# api-showcase
The api-showcase repository contains code fir DCI API demonstration



### Steps to set up RabbitMQ
    - Navigate to docker-compose-files/pg_kc.yml and start the rabbitmq server.
    - To access the RabbitMQ Management Tool: Hit the Url localhost:15672 and provide the valid credentials.

### Steps to connect the applications server with RabbitMQ
    - Add the spring-boot-starter-amqp dependency in applications pom.xml file.
    - Provide the necessary configuration of rabbitmq in application.yml file.
    - Run your application, you will be able to see the connections in RabbitMQ Management Tool.


