package com.senla.hoteldb.dao;

import java.util.ArrayList;
import java.util.List;

import com.senla.hoteldb.models.Guest;

public class GuestDAO{
	private List<Guest> guests = new ArrayList<Guest>();
	
	
	public List<Guest> getGuests() {
		return guests;
	}
	public void setGuests(List<Guest> list) {
		this.guests = list;
	}
	
}
