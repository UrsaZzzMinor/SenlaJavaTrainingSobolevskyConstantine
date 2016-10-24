package com.senla.hoteldb.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import com.senla.hoteldb.models.Guest;
import com.senla.hoteldb.models.Service;

public class ConvertToGuest {
	SimpleDateFormat sdf = new SimpleDateFormat("yyy,mm,dd");
	public List<Guest> convertToGuest(String[] list, List<Guest> guests, List<Service> services){
		for (int i=0; i<list.length; i++){
			Guest guest = new Guest();
			Service service = new Service();
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
				} else if ((j>=9) && (j%3==0)){
					service.setName(info[j]);
				} else if ((j>=10) && (j%3==1)){
					service.setPrice(Integer.parseInt(info[j]));
				} else if ((j>=11) && (j%3==2)){
					try {
						service.setDate(sdf.parse(info[j]));
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					guest.getServices().add(service);
					Boolean serviceExist = new Boolean(false);
					for(Service thing: services){
						if (thing.getName().equalsIgnoreCase(service.getName())) serviceExist = true;
					}
					if (!serviceExist) services.add(service);
					service = new Service();
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
