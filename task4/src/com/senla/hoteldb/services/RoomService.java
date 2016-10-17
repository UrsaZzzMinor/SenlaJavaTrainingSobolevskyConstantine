package com.senla.hoteldb.services;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.senla.hoteldb.dao.RoomDAO;
import com.senla.hoteldb.models.Guest;
import com.senla.hoteldb.models.Room;

//sort lists here

public class RoomService {
	public void showRooms(List<Room> rooms){
		System.out.printf("%nHere's the information about needed rooms in our hotel:%n%n");
		for (Room thing: rooms){
			StringBuilder sb = new StringBuilder();
			sb.append("Room id = ");
			sb.append(thing.getRoomID());
			sb.append(" Price = ");
			sb.append(thing.getPrice());
			sb.append(" Capacity = ");
			sb.append(thing.getCapacity());
			sb.append(" NumStars = ");
			sb.append(thing.getNumStars());
			sb.append(" BusyStatus = ");
			sb.append(thing.getBusy());
			System.out.println(sb);
		}
	}
	public List<Room> showFutureFreeRooms(List<Room> futFreeRooms, List<Room> emptyRooms, String s){
		List<Room> futureEmptyRooms = new ArrayList<Room>();
		System.out.printf("%nHere's the list of rooms which will be free in future:%n%n");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MM,dd");
		for (Room thing: futFreeRooms ){
			if (sdf.format(thing.getDepDate()).compareTo(s) <= 0){
			futureEmptyRooms.add(thing);
			}
		}
		
		for (Room thing: futureEmptyRooms){
			System.out.printf(" Room id = %d%n", thing.getRoomID());
		}
		return futureEmptyRooms;
	}
	
	public void showPrices(List<Room> rooms, List<Guest> guests, List<String> list){
		System.out.println("\nHere're displayed the room and service prices: \n");
		for (int i=0; i < rooms.size(); i++){
			StringBuilder sb = new StringBuilder();
			sb.append(" Room id = ");
			sb.append(rooms.get(i).getRoomID());
			sb.append(" Price = ");
			sb.append(rooms.get(i).getPrice());
			list.add(rooms.get(i).getPrice().toString());
			if (guests.get(i).getName().equalsIgnoreCase("null")){
				continue;
			}
			for (int j=0; j < guests.get(i).getServices().size(); j++){
				sb.append(" Service = ");
				sb.append(guests.get(i).getServices().get(j));
				sb.append(" Price = ");
				sb.append(guests.get(i).getPrices().get(j));
			}
			System.out.println(sb);
		}
	}
	
	public void showFurniture(Room room){
		System.out.println("\nHere's represented the furniture of the room:\n");
		for (int i=0; i<room.getFurniture().length; i++){
		System.out.printf("%s ",room.getFurniture()[i]);
		}
	}
	
	
}
