package com.senla.hoteldb;

import java.util.Collections;
import java.util.List;

import com.senla.hoteldb.comparator.GuestComporator;
import com.senla.hoteldb.comparator.RoomComparator;
import com.senla.hoteldb.comparator.StringComparator;
import com.senla.hoteldb.converter.ConvertToGuest;
import com.senla.hoteldb.converter.ConvertToEmptyRoom;
import com.senla.hoteldb.converter.ConvertToRoom;
import com.senla.hoteldb.dao.GuestDAO;
import com.senla.hoteldb.dao.RoomDAO;
import com.senla.hoteldb.database.DB;
import com.senla.hoteldb.facade.Facade;
import com.senla.hoteldb.models.Guest;
import com.senla.hoteldb.services.GuestService;
import com.senla.hoteldb.services.RoomService;;

public class Runner {

	public static void main(String[] args) {
		DB db = new DB();
		db.loadDB();
		RoomDAO rd = new RoomDAO();
		ConvertToRoom cr = new ConvertToRoom();
		rd.setRooms(cr.convertToRoom(db.getHotelDB(), rd.getRooms()));
		ConvertToEmptyRoom cer = new ConvertToEmptyRoom();
		rd.setEmptyRooms(cer.convertToEmptyRoom(db.getHotelDB(), rd.getEmptyRooms()));
		RoomService rs = new RoomService();
		GuestDAO gd = new GuestDAO();
		ConvertToGuest cg = new ConvertToGuest();
		gd.setGuests(cg.convertToGuest(db.getHotelDB(), gd.getGuests()));
		GuestService gs = new GuestService();
		rs.showRooms(rd.getRooms());
		rs.showEmptyRooms(rd.getEmptyRooms());
		gs.showGuests(gd.getGuests());
		System.out.printf("%nThe Number of empty rooms equals = %d%n", rd.getEmptyRooms().size());
		System.out.printf("%nThe Number of guests in the hotel equals = %d%n", gd.getGuests().size());
		rs.showFutureFreeRooms(rd.getRooms(), rd.getEmptyRooms(), rd.getFutureFreeRooms(), "2016,11,19");
		List<Integer> cost = gs.totalCost(gd.getGuests().get(1), rd.getRooms(), "2016,11,19");
		System.out.printf("%nTotalCost for %d days = %d", cost.get(0), cost.get(1));
		rd.getRooms().sort(new RoomComparator("id"));
		gs.showEveryone(gd.getGuests(), rd.getRooms().get(0));
//		gs.serviceInfo(gd.getGuests().get(0));
		
		
		
	}
	
}
