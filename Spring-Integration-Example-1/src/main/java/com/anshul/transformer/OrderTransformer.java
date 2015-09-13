package com.anshul.transformer;

import org.springframework.integration.annotation.Transformer;
import org.springframework.messaging.Message;

import com.anshul.generated.order.data.Order;

public class OrderTransformer {
	@Transformer
	public Object transform(Message message) {
		com.anshul.data.Order order = (com.anshul.data.Order) message.getPayload();
		Order modifiedOrder = new Order();
		modifiedOrder.setOrderID(Integer.toString(order.getOrderId()));
		return modifiedOrder;
	}

}
