package com.senla.hoteldb.models;

import java.util.Date;

public class Service {
	private String name;
	private Integer price;
	private Date date;
	
	public Service(String name, Integer price, Date date) {
		super();
		this.name = name;
		this.price = price;
		this.date = date;
	}
	public Service() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
