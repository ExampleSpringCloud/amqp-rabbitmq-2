package com.marcuschiu.ampqrabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AmpqRabbitmqApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmpqRabbitmqApplication.class, args);
	}

	@RabbitListener(queues = "${queue.name}")
	public void processOrder(String string) {
		System.out.println(string);
	}
}
