package com.senla.hoteldb.comparator;

import java.util.Comparator;

import com.senla.hoteldb.models.Guest;

public class GuestComporator implements Comparator<Guest> {
	private String s;
	
	public GuestComporator(String s){
		this.s = s;
	}
	
	public GuestComporator(){
		
	}

	@Override
	public int compare(Guest o1, Guest o2) {
		if (s.equalsIgnoreCase("alphabet")){
			return o1.getSurName().compareTo(o2.getSurName());
		} else if (s.equalsIgnoreCase("date")){
			return o1.getDepDate().compareTo(o2.getDepDate());
		} else if (s.equalsIgnoreCase("reverseDate")){
			return o2.getDepDate().compareTo(o1.getDepDate());
		} else return 0;
	}
	
}
