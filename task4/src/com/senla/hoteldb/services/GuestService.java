package com.senla.hoteldb.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import com.senla.hoteldb.comparator.GuestComporator;
import java.util.List;

import com.senla.hoteldb.models.Guest;
import com.senla.hoteldb.models.Room;

public class GuestService {
	public void showGuests(List<Guest> guests){
		System.out.printf("%nHere's the information about guests:%n%n");
		guests.sort(new GuestComporator("reversedate"));
		for (Guest thing: guests){
			StringBuilder sb = new StringBuilder();
			sb.append("Room id = ");
			sb.append(thing.getRoomID());
			sb.append(" Name = ");
			sb.append(thing.getName());
			sb.append(" Surname = ");
			sb.append(thing.getSurName());
			sb.append(" The Departure date = ");
			sb.append((new SimpleDateFormat("yyyy,MM,dd")).format(thing.getDepDate()));
			sb.append(" the Arrival date = ");
			sb.append((new SimpleDateFormat("yyyy,MM,dd")).format(thing.getArrivalDate()));
			System.out.println(sb);
		}
	}
	
	
	
	public List<Integer> totalCost(Guest guest, List<Room> rooms, String s){
		List<Integer> cost = new ArrayList<Integer>();
		Long diff = guest.getArrivalDate().getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MM,dd");
		try {
			diff = sdf.parse(s).getTime() - diff;
			diff/=(24*60*60*1000);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cost.add(diff.intValue());
		for (Room thing: rooms){
			if (thing.getRoomID().equals(guest.getRoomID())){
				cost.add(thing.getPrice() * cost.get(0));
			}
		}
		return cost;
	}
	
	public void showEveryone(List<Guest> guests, Room room){
		System.out.printf("%nHere's the information about every guests:%n%n");
		Collections.sort(guests, new GuestComporator("reversedate"));
		int i = 3;
		for (Guest thing: guests){
			if ((thing.getRoomID().equals(room.getRoomID())) && (i>0)){
				StringBuilder sb = new StringBuilder();
				sb.append("Room id = ");
				sb.append(thing.getRoomID());
				sb.append(" Name = ");
				sb.append(thing.getName());
				sb.append(" Surname = ");
				sb.append(thing.getSurName());
				sb.append(" The departure date = ");
				sb.append((new SimpleDateFormat("yyyy,MM,dd")).format(thing.getDepDate()));
				sb.append(" the Arrival date = ");
				sb.append((new SimpleDateFormat("yyyy,MM,dd")).format(thing.getArrivalDate()));
				System.out.println(sb);
				--i;
			}
		}
	}
	
//	public List<String> serviceInfo(Guest guest){
//		List<String> services = new ArrayList<String>();
//		System.out.println("\nHere's the info about guest's services: ");
//		for (int i=0; i < guest.getServices().size(); i++){
//			System.out.printf(" Service = %s; ", services.set(i));
//			System.out.printf("price = %d; ",guest.getPrices().get(i));
//			SimpleDateFormat sdf = new SimpleDateFormat("yyy,mm,dd");
//			try {
//				System.out.printf("date = %s.%n",sdf.format(sdf.parse(guest.getDates().get(i))));
//			} catch (ParseException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		return ;
//	}
}
