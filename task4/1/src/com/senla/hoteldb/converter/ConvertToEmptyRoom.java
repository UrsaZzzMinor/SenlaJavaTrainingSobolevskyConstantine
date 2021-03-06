package com.senla.hoteldb.converter;

import java.util.List;

import com.senla.hoteldb.comparator.RoomComparator;
import com.senla.hoteldb.models.Room;

public class ConvertToEmptyRoom {
	public List<Room> convertToEmptyRoom(String[] list, List<Room> emptyRooms, List<Room> rooms){
		for (int i=0; i<list.length; i++){
			Room room = new Room();
			String[] info = list[i].split("-");
			for (int j=0; j < info.length; j++){
				if (j==0){
					room.setRoomID(Integer.parseInt(info[j]));
				} else if (j==1){
					room.setPrice(Integer.parseInt(info[j]));
				} else if (j==2){
					room.setCapacity(Integer.parseInt(info[j]));
				} else if (j==3){
					room.setNumStars(Integer.parseInt(info[j]));
				} else if (j==4){
					room.setBusy(Boolean.valueOf(info[j]));
				} else if (j==7){
					room.setDepDate(info[j]);
				} 
			}
			String s = new String();
			if (!room.getBusy()) {
				//emptyRooms.sort(new RoomComparator("id"));
				for (Room thing: rooms){
					if(thing.getRoomID().equals(room.getRoomID()) && (thing.getBusy())){
						s = "continue";
					}
				}
				if (s.equalsIgnoreCase("continue")){
					continue;
				}else {
					emptyRooms.add(room);
				}	
			}
		}
		return emptyRooms;
	}
}
