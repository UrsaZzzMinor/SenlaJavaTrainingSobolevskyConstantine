package com.senla.hoteldb.comparator;

import java.util.Comparator;

public class StringComparator  implements Comparator<String>{
	private String s;
	
	public StringComparator(){}
	
	public StringComparator(String s){
		this.s = s;
	}

	@Override
	public int compare(String o1, String o2) {
		if (s.equalsIgnoreCase("pricestr")){
			return o1.compareTo(o2);
		}else return 0;
	}
	
	
}
