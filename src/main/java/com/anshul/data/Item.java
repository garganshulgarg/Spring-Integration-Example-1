package com.anshul.data;

import java.io.Serializable;
import java.math.BigDecimal;

public class Item implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String title;
	protected String publisher;
	protected BigDecimal price;
	protected int yearPublished;

	
	
	
	public Item() {
		//super();
	}

	public Item(String title, String publisher, BigDecimal price, int yearPublished) {
		super();
		this.title = title;
		this.publisher = publisher;
		this.price = price;
		this.yearPublished = yearPublished;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

}
