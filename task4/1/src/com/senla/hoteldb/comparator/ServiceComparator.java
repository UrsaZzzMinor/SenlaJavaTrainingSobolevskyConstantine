package com.senla.hoteldb.comparator;

import java.text.SimpleDateFormat;
import java.util.Comparator;

import com.senla.hoteldb.models.Service;

public class ServiceComparator implements Comparator<Service> {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy,mm,dd");
	private String s;
	
	
	public ServiceComparator(String s) {
		this.s = s;
	}
	
	public ServiceComparator() {
	}


	@Override
	public int compare(Service o1, Service o2) {
		if (this.s.equalsIgnoreCase("price")){
			return o1.getPrice().compareTo(o2.getPrice());
		} else if (this.s.equalsIgnoreCase("date")) {
			return sdf.format(o1.getDate()).compareTo(sdf.format(o2.getDate()));
		}else return 0;
	}
	
}
