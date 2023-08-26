package com.gorkem.rabbitmq;

import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQExchangeConfiguration {

	@Bean
	Exchange exampleExchange() {
		return new TopicExchange("ExampleExchange");
	}

	@Bean
	Exchange exampleSecondExchange() {
		return ExchangeBuilder.directExchange("ExampleSecondExchange").autoDelete().internal().build();
	}
}
