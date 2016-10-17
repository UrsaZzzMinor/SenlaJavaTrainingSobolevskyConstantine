package com.senla.hoteldb.models;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Room {
	//private variables
	private Integer roomID;
	private Integer price;
	private Integer capacity;
	private Integer numStars;
	private Boolean busy;
	private Date departureDate;
	private String[] furniture = {"Bed","Wadrobe","Table","Carpet","Armchair"};
	public String[] getFurniture() {
		return furniture;
	}
	
	//getters & setters
	public Integer getRoomID() {
		return roomID;
	}
	public void setRoomID(Integer roomID) {
		this.roomID = roomID;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	public Integer getNumStars() {
		return numStars;
	}
	public void setNumStars(Integer numStars) {
		this.numStars = numStars;
	}
	public Boolean getBusy() {
		return busy;
	}
	public void setBusy(Boolean busy) {
		this.busy = busy;
	}
	public Date getDepDate() {
		return departureDate;
	}
	public void setDepDate(String s) {
		DateFormat df = new SimpleDateFormat("yyyy,MM,dd");
		try {
			departureDate = df.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
