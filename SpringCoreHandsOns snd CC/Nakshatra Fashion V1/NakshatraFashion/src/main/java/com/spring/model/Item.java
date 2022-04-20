package com.spring.model;

import org.springframework.stereotype.Component;

//pojo class with required attributes,getters and setters 
//use appropriate annotation to make this class as component class
@Component
public class Item {

	private String itemId;
	private String itemType;
	private double price;

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
