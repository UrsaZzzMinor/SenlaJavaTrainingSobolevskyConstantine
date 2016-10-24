package com.senla.hoteldb.dao;

import java.util.ArrayList;
import java.util.List;

import com.senla.hoteldb.database.DB;
import com.senla.hoteldb.models.Room;

public class RoomDAO extends Room {
	private List<Room> rooms = new ArrayList<Room>();
	private List<Room> emptyRooms = new ArrayList<Room>();
	private List<Room> futureFreeRooms = new ArrayList<Room>();
	
	public List<Room> getRooms() {
		return rooms;
	}
	public void setRooms(List<Room> list) {
		this.rooms = list;
	}
	public List<Room> getEmptyRooms() {
		return emptyRooms;
	}
	public void setEmptyRooms(List<Room> emptyRooms) {
		this.emptyRooms = emptyRooms;
	}
	public List<Room> getFutureFreeRooms() {
		return futureFreeRooms;
	}
	public void setFutureFreeRooms(List<Room> futureFreeRooms) {
		this.futureFreeRooms = futureFreeRooms;
	}
	
	
	
}
