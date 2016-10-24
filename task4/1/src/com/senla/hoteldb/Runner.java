package com.senla.hoteldb;

import com.senla.hoteldb.facade.Facade;;

public class Runner {
	

	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.startFacade();
		facade.showInfo();
		
		
		
	}
	
}
