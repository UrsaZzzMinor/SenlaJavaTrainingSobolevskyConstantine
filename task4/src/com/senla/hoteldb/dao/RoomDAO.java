package com.senla.hoteldb.dao;

import java.util.ArrayList;
import java.util.List;

import com.senla.hoteldb.models.Room;

public class RoomDAO extends Room {
	private List<Room> rooms = new ArrayList<Room>();
	private List<Room> emptyRooms = new ArrayList<Room>();
	private List<String> list = new ArrayList<String>();
	
	public List<String> getList() {
		return list;
	}
	public List<Room> getRooms() {
		return rooms;
	}
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	public List<Room> getEmptyRooms() {
		return emptyRooms;
	}
	public void setEmptyRooms(List<Room> emptyRooms) {
		this.emptyRooms = emptyRooms;
	}
	
	
	
}
