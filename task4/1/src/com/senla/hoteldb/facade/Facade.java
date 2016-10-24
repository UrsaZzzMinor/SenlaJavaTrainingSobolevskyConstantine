package com.senla.hoteldb.facade; // getting lists from dao?


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import com.senla.hoteldb.database.DB;
import com.senla.hoteldb.dao.GuestDAO;
import com.senla.hoteldb.dao.RoomDAO;
import com.senla.hoteldb.dao.ServiceDAO;
import com.senla.hoteldb.models.Guest;
import com.senla.hoteldb.models.Room;
import com.senla.hoteldb.services.RoomService;
import com.senla.hoteldb.services.ServiceService;
import com.senla.hoteldb.services.GuestService;
import com.senla.hoteldb.comparator.StringComparator;
import com.senla.hoteldb.converter.ConvertToEmptyRoom;
import com.senla.hoteldb.converter.ConvertToGuest;
import com.senla.hoteldb.converter.ConvertToRoom;
import com.senla.hoteldb.comparator.ServiceComparator;
import com.senla.hoteldb.comparator.RoomComparator;
import com.senla.hoteldb.comparator.GuestComporator;

public class Facade {
	private DB db;
	private RoomDAO rd;
	private ConvertToRoom cr;
	private ConvertToEmptyRoom cer;
	private RoomService rs;
	private GuestDAO gd;
	private ConvertToGuest cg;
	private GuestService gs;
	private ServiceDAO sd;
	private ServiceService ss;
	
	public Facade(){
		this.db = new DB();
		this.rd = new RoomDAO();
		this.cr = new ConvertToRoom();
		this.cer = new ConvertToEmptyRoom();
		this.rs = new RoomService();
		this.gd = new GuestDAO();
		this.gs = new GuestService();
		this.cg = new ConvertToGuest();
		this.gs = new GuestService();
		this.sd = new ServiceDAO();
		this.ss = new ServiceService();
	}
	
	public void startFacade(){
		db.loadDB();
		rd.setRooms(cr.convertToRoom(db.getHotelDB(), rd.getRooms()));
		rd.setEmptyRooms(cer.convertToEmptyRoom(db.getHotelDB(), rd.getEmptyRooms(), rd.getRooms()));
		gd.setGuests(cg.convertToGuest(db.getHotelDB(), gd.getGuests(), sd.getServices()));
	}
	
	public void showInfo(){
		rs.showRooms(rd.getRooms());
		rs.showEmptyRooms(rd.getEmptyRooms());
		gs.showGuests(gd.getGuests());
		System.out.printf("%nThe Number of empty rooms equals = %d%n", rd.getEmptyRooms().size());
		System.out.printf("%nThe Number of guests in the hotel equals = %d%n", gd.getGuests().size());
		rs.showFutureFreeRooms(rd.getRooms(), rd.getEmptyRooms(), rd.getFutureFreeRooms(), "2016,11,19");
		List<Integer> cost = gs.totalCost(gd.getGuests().get(1), rd.getRooms(), "2016,11,19");
		System.out.printf("%nTotalCost for %d days = %d%n", cost.get(0), cost.get(1));
		rd.getRooms().sort(new RoomComparator("id"));
		gs.showEveryone(gd.getGuests(), rd.getRooms().get(0));
		System.out.println(gs.serviceInfo(gd.getGuests().get(0)));
		System.out.println(rs.showPrices(rd.getRooms(), "date"));
		System.out.println(ss.showPrices(sd.getServices(), "price"));
		System.out.println(rs.ShowRoomInfo(rd.getRooms().get(1), gd.getGuests()));
	}

	public void settleGuest(List<Guest> guests, Guest guest){
		guests.add(guest);
	}
	
	public void departureFromRoom(Guest guest, String s){
		guest.setDepDate(s);
	}
	
	public void changeRoomStatus(Room room){
		room.setBusy(true);
	}
	
	public void changeRoomPrice(Room room, Integer price){//add room index for using Room room as an entry parameter
		room.setPrice(price);
	}
	
	public void changeServicePrice(Guest guest, int index, Integer price){// -//-
		guest.getServices().get(index).setPrice(price);
	}
	
	public void addRoom(List<Room> rooms, Room room){
		rooms.add(room);				
	}
	
	/* !THINK! of it, how to combine two lists with different oobject types into simple String[]
	public String[] convertRooms(List<Room> rooms, List<Guest> guests){
		String[] array = new String[rooms.size()];
		for (int i=0; i<rooms.size();i++){
			
		}
	}
	*/
}
