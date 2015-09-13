package com.anshul.splitter;

import org.springframework.integration.splitter.AbstractMessageSplitter;
import org.springframework.messaging.Message;

public class OrderSplitter extends AbstractMessageSplitter{

	@Override
	protected Object splitMessage(Message message) {
		System.out.println(message.getPayload());
		System.out.println(message);
		return null;
		/*Order payload = (Order)message.getPayload();
		MessageHeaders headers = message.getHeaders();
		System.out.println(headers.getTimestamp());
		System.out.println("Anshul Garg Splitter is invoked successfully.....");
		System.out.println(payload.getOrderId());
		return null;*/
	}

}
