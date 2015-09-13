package com.anshul.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anshul.data.Order;
import com.anshul.gateway.Shop;

public class OnlineShop {

	public static void main(String arr[]) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/shop.xml", OnlineShop.class);
		Shop shop = (Shop) context.getBean("shop");
		final Order order = createOrder();
		shop.placeOrder(order);
		context.close();
	}

	public static Order createOrder() {
		Order order = new Order();
		order.setOrderId(123456);
		return order;
	}
}
