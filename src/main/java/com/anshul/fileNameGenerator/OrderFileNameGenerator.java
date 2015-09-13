package com.anshul.fileNameGenerator;

import java.util.Date;

import org.springframework.integration.file.FileNameGenerator;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.xml.transform.StringSource;

import com.anshul.generated.order.data.Order;

public class OrderFileNameGenerator implements FileNameGenerator {

	private Jaxb2Marshaller jaxb2Marshaller;

	public String generateFileName(Message<?> message) {
		MessageHeaders headers = message.getHeaders();
		String orderID = (String) headers.get("orderID");
		System.out.println("orderID" + orderID);
		Date date = new Date();
		long timeStamp = date.getTime();
		return "order_" + orderID + "_" + timeStamp + ".xml";
	}

	public Jaxb2Marshaller getJaxb2Marshaller() {
		return jaxb2Marshaller;
	}

	public void setJaxb2Marshaller(Jaxb2Marshaller jaxb2Marshaller) {
		this.jaxb2Marshaller = jaxb2Marshaller;
	}

}
