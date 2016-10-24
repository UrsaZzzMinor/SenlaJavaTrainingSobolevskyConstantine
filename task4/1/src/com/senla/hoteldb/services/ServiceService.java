package com.senla.hoteldb.services;

import java.util.List;

import com.senla.hoteldb.comparator.ServiceComparator;
import com.senla.hoteldb.models.Service;

public class ServiceService {
	public String showPrices(List<Service> services, String s){
		System.out.println("\nHere're the prices of all possible at current moment services: \n");
		StringBuilder sb = new StringBuilder();
		services.sort(new ServiceComparator(s));
		for (Service thing: services){
			if (thing.getName().equalsIgnoreCase("null"))continue;
			sb.append("\n Service name = ");
			sb.append(thing.getName());
			sb.append(" Price = ");
			sb.append(thing.getPrice());
		}
		return sb.toString();
	}
}
