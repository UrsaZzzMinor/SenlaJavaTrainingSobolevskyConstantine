package com.senla.hoteldb.services;

import java.text.SimpleDateFormat;
import java.util.List;

import com.senla.hoteldb.comparator.RoomComparator;
import com.senla.hoteldb.models.Guest;
import com.senla.hoteldb.models.Room;
import com.senla.hoteldb.models.Service;

//sort lists here

public class RoomService {
	public void showRooms(List<Room> rooms){
		System.out.printf("%nHere's the information about needed rooms in our hotel:%n%n");
		rooms.sort(new RoomComparator("price"));
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
	public void showEmptyRooms(List<Room> emptyRooms){
		System.out.printf("%nHere's the information about needed rooms in our hotel:%n%n");
		emptyRooms.sort(new RoomComparator("capacity"));
		for (Room thing: emptyRooms){
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
	
	public List<Room> showFutureFreeRooms(List<Room> rooms, List<Room> emptyRooms, List<Room> futureFreeRooms, String s){
		System.out.printf("%nHere's the list of rooms which will be free in future:%n%n");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MM,dd");
		for (Room thing: rooms){
			if (sdf.format(thing.getDepDate()).compareTo(s) <= 0){
				futureFreeRooms.add(thing);
			}
		}
		
		futureFreeRooms.addAll(emptyRooms);
		for (Room thing: futureFreeRooms){
			System.out.printf(" Room id = %d%n", thing.getRoomID());
		}
		return futureFreeRooms;
	}
	
	public String showPrices(List<Room> rooms, String s){
		System.out.println("\nHere're the prices f rooms: ");
		StringBuilder sb = new StringBuilder();
		rooms.sort(new RoomComparator(s));
		for (Room thing: rooms){
			sb.append("\n Room_id = ");
			sb.append(thing.getRoomID());
			sb.append(" Price = ");
			sb.append(thing.getPrice());
		}
		return sb.toString();
	}
	
	public String ShowRoomInfo(Room room, List<Guest> guests){
		System.out.println("\nHere's the room info: \n");
		StringBuilder sb = new StringBuilder();
		sb.append("Room id = ");
		sb.append(room.getRoomID());
		sb.append(" Price = ");
		sb.append(room.getPrice());
		sb.append(" Capacity = ");
		sb.append(room.getCapacity());
		sb.append(" NumStars = ");
		sb.append(room.getNumStars());
		sb.append(" BusyStatus = ");
		sb.append(room.getBusy());
		for (Guest thing: guests){
			if (thing.getRoomID().equals(room.getRoomID())){
				sb.append("\n GuestName = ");
				sb.append(thing.getName());
				sb.append(" GuestSurname = ");
				sb.append(thing.getSurName());
				sb.append(" DepartureDate = ");
				sb.append(thing.getDepDate());
				sb.append(" ArrivalDate = ");
				sb.append(thing.getArrivalDate());
				for (Service secondThing: thing.getServices()){
					sb.append("\nServiceName = ");
					sb.append(secondThing.getName());
					sb.append(" ServicePrice = ");
					sb.append(secondThing.getPrice());
					sb.append(" ServiceDate = ");
					sb.append(secondThing.getDate());
				}
			}
		}
		return sb.toString();
	}
	
	
//	public void showPrices(List<Room> rooms, List<Guest> guests, List<String> list){
//		System.out.println("\nHere're displayed the room and service prices: \n");
//		for (int i=0; i < rooms.size(); i++){
//			StringBuilder sb = new StringBuilder();
//			sb.append(" Room id = ");
//			sb.append(rooms.get(i).getRoomID());
//			sb.append(" Price = ");
//			sb.append(rooms.get(i).getPrice());
//			list.add(rooms.get(i).getPrice().toString());
//			if (guests.get(i).getName().equalsIgnoreCase("null")){
//				continue;
//			}
//			for (int j=0; j < guests.get(i).getServices().size(); j++){
//				sb.append(" Service = ");
//				sb.append(guests.get(i).getServices().get(j));
//				sb.append(" Price = ");
//				sb.append(guests.get(i).getPrices().get(j));
//			}
//			System.out.println(sb);
//		}
//	}
	
//	public void showFurniture(Room room){
//		System.out.println("\nHere's represented the furniture of the room:\n");
//		for (int i=0; i<room.getFurniture().length; i++){
//		System.out.printf("%s ",room.getFurniture()[i]);
//		}
//	}
	
	
}
