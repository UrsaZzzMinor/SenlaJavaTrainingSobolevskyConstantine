package com.senla.hoteldb.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.senla.hoteldb.models.Guest;

public class ServiceService {
	public List<String> serviceInfo(Guest guest){
		List<String> services = new ArrayList<String>();
		System.out.println("\nHere's the info about guest's services: ");
		for (int i=0; i < guest.getServices().size(); i++){
			System.out.printf(" Service = %s; ", services.set(i));
			System.out.printf("price = %d; ",guest.getPrices().get(i));
			SimpleDateFormat sdf = new SimpleDateFormat("yyy,mm,dd");
			try {
				System.out.printf("date = %s.%n",sdf.format(sdf.parse(guest.getDates().get(i))));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return ;
	}
}
