package com.senla.hoteldb.converter;

import java.util.List;

import com.senla.hoteldb.models.Guest;

public class ConvertToGuest {
	public List<Guest> convertToGuest(String[] list, List<Guest> guests){
		for (int i=0; i<list.length; i++){
			Guest guest = new Guest();
			String[] info = list[i].split("-");
			for (int j=0; j < info.length; j++){
				if (j==0){
					guest.setRoomID(Integer.parseInt(info[j]));
				} else if (j==5){
					guest.setName(info[j]);
				} else if (j==6){		
					guest.setSurName(info[j]);
				} else if (j==7){
					guest.setDepDate(info[j]);
				} else if (j==8){
					guest.setArrivalDate(info[j]);
				} 
			}
			if (guest.getName().equalsIgnoreCase("null")){
				continue;
			} else {
				guests.add(guest);
			}
		}
		return guests;
	}
}
