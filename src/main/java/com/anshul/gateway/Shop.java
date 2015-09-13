package com.anshul.gateway;


import org.springframework.integration.annotation.Gateway;

import com.anshul.data.Order;


public interface Shop {
	@Gateway(requestChannel="ordersChannel")
	void placeOrder(Order order);
}
