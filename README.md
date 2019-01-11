# Listener
  
### Setup RabbitMQ
- install and run rabbitmq
- open browser http://localhost:15672
  - username: guest
  - password: guest
- create exchange named <code>tut.fanout</code>
- create queue named <code>test</code>
- bind exchange <code>tut.fanout</code> to queue <code>test</code>

### Run Application
- <code>mvn spring-boot:run</code>

### Test Application
- run the other application and go to <code>http://localhost:8080/</code>
  - you should see <code>Hello World</code> printed out in console