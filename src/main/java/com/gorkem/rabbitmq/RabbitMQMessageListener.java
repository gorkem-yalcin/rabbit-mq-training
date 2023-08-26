package com.gorkem.rabbitmq;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class RabbitMQMessageListener implements MessageListener {

	@Override
	public void onMessage(Message message) {
		System.out.print(new String(message.getBody()));
	}
}
