package com.senla.hoteldb.comparator;

import java.util.Comparator;

import com.senla.hoteldb.models.Room;

public class RoomComparator implements Comparator<Room> {
	private String s;
	
	public RoomComparator(String s) {
		this.s = s;
	}
	
	public RoomComparator() {
	}
	
	@Override
    public int compare(Room o1, Room o2) {
		if (this.s.equalsIgnoreCase("price")){
			return o1.getPrice().compareTo(o2.getPrice());
		} else if (this.s.equalsIgnoreCase("capacity")){
			return o1.getCapacity().compareTo(o2.getCapacity());
		} else if (this.s.equalsIgnoreCase("numStars")){
			return o1.getNumStars().compareTo(o2.getNumStars());
		} else if (s.equalsIgnoreCase("date")){
			return o1.getDepDate().compareTo(o2.getDepDate());
		} else return 0;
    }
	
	
	
}
