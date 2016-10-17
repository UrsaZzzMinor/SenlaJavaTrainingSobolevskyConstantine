package com.senla.hoteldb.dao;

import java.util.ArrayList;
import java.util.List;

import com.senla.hoteldb.models.Guest;

public class GuestDAO{
	
	private List<Guest> guests = new ArrayList<Guest>();
	private List<Guest> everyGuests = new ArrayList<>();
	
	public void setGuests(List<Guest> guests) {
		this.guests = guests;
	}

	public void setEveryGuest(List<Guest> guests){
		this.everyGuests = guests;
	}

	public List<Guest> getEveryGuests(){
		return everyGuests;
	}
	
	
	public List<Guest> getGuests() {
		return guests;
	}
	
	
}
