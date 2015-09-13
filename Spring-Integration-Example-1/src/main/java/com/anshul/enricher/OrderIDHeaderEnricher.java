package com.anshul.enricher;

import org.springframework.messaging.Message;

import com.anshul.generated.order.data.Order;

public class OrderIDHeaderEnricher {

	public String putOrderIDInHeader(Message message) {
		Order order = (Order) message.getPayload();
		return order.getOrderID();

	}
}
