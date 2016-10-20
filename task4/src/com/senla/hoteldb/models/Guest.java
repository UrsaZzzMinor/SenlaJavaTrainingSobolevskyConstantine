package com.senla.hoteldb.models;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

public class Guest{
	private String name;
	private String surName;
	private Integer roomID;
	private Date departureDate;
	private Date arrivalDate;
	private List<Service> services = new ArrayList<Service>(); 
	
	public String getName() {
		return name;
	}
	public Guest() {
		super();
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public Integer getRoomID() {
		return roomID;
	}
	public void setRoomID(Integer roomID) {
		this.roomID = roomID;
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
	
	public Date getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(String s) {
		DateFormat df = new SimpleDateFormat("yyyy,MM,dd");
		try {
			arrivalDate = df.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
