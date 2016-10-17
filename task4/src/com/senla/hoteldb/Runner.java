package com.senla.hoteldb;

import java.util.Collections;
import java.util.List;

import com.senla.hoteldb.comparator.GuestComporator;
import com.senla.hoteldb.comparator.RoomComparator;
import com.senla.hoteldb.comparator.StringComparator;
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
		Guest guest = new Guest();
		guest.setName("Alfred");
		guest.setSurName("Palmer");
		Facade fac = new Facade();
		fac.setArray(db.load());			
		RoomDAO ro = new RoomDAO();
		RoomService rs = new RoomService();
		GuestDAO go = new GuestDAO();
		GuestService gs = new GuestService();
		ro.setRooms(db.getRooms());
		ro.setEmptyRooms(db.getEmptyRooms());
		go.setGuests(db.getGuests());
		go.setEveryGuest(db.getEveryGuest());
		//sort(ro.getRooms(), new RoomComparator());
		System.out.println(ro.getRooms());
		Collections.sort(ro.getRooms(), new RoomComparator("capacity"));
		rs.showRooms(ro.getRooms());
		Collections.sort(ro.getEmptyRooms(), new RoomComparator("price"));
		rs.showRooms(ro.getEmptyRooms());
		Collections.sort(go.getGuests(), new GuestComporator("date"));
		gs.showGuests(go.getGuests());
		System.out.printf("%nThe Number of empty rooms equals = %d%n", ro.getEmptyRooms().size() );
		System.out.printf("%nThe Number of guests in the hotel equals = %d%n", go.getGuests().size());
		rs.showFutureFreeRooms(ro.getRooms(), ro.getEmptyRooms(), "2016,11,21");
		List<Integer> cost = gs.totalCost(go.getGuests().get(1), ro.getRooms(), "2016,11,21");
		System.out.printf("%nTotalCost for %d days = %d", cost.get(0), cost.get(1));
		gs.showEveryone(go.getEveryGuests(), ro.getRooms().get(3));
		gs.serviceInfo(go.getGuests().get(0));
		rs.showPrices(ro.getRooms(), go.getEveryGuests(), ro.getList());
		//ro.getList().sort(new StringComparator("priceStr"));
		//System.out.println(ro.getList());
		rs.showFurniture(ro.getRooms().get(0));
		fac.settleIntoRoom(2, guest);
		db.save(fac.convertArray());
		
		
		
	}
	
}
