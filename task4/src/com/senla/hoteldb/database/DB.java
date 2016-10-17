package com.senla.hoteldb.database;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.danco.training.TextFileWorker;
import com.senla.hoteldb.models.Guest;
import com.senla.hoteldb.models.Room;

public class DB {
	private final String path = "resources/hotel.txt";
	private TextFileWorker fileWorker = new TextFileWorker(path);
	private List<Room> rooms = new ArrayList<Room>();
	private List<Room> emptyRooms = new ArrayList<Room>();
	private List<Guest> guests = new ArrayList<Guest>();
	private List<Guest> everyGuests = new ArrayList<Guest>();
	
	public List<Room> getRooms() {
		return rooms;
	}
	
	public List<Room> getEmptyRooms() {
		return emptyRooms;
	}
	
	public List<Guest> getGuests() {
		return guests;
	}
	
	public List<Guest> getEveryGuest() {
		return everyGuests;
	}


	public String[][] load(){
		String[] array = fileWorker.readFromFile();
		String[][] array2 = new String[15][15];
		for (int i=1; i<array.length; i++){
			Room room = new Room();
			Guest guest = new Guest();
			String[] info = array[i].split("-");
			
			for (int j=0; j<info.length; j++){
				array2[i][j] = info[j];
				if (j==0){
					room.setRoomID(Integer.parseInt(info[j]));
					guest.setRoomID(Integer.parseInt(info[j]));
				} else if (j==1){
					room.setPrice(Integer.parseInt(info[j]));
				} else if (j==2){
					room.setCapacity(Integer.parseInt(info[j]));
				} else if (j==3){
					room.setNumStars(Integer.parseInt(info[j]));
				} else if (j==4){
					room.setBusy(Boolean.valueOf(info[j]));
				} else if (j==5){
					guest.setName(info[j]);
				} else if (j==6){		
					guest.setSurName(info[j]);
				} else if (j==7){
					guest.setDepDate(info[j]);
					room.setDepDate(info[j]);
				} else if (j==8){
					guest.setArrivalDate(info[j]);
				} else if ((j==9) || (j==12)){
					guest.getServices().add(info[j]);
				} else if ((j==10) ||(j==13)){
					guest.getPrices().add(Integer.parseInt(info[j]));
				} else if ((j==11) || (j==14)){
					guest.getDates().add(info[j]);
				} 
			}
			if (!guest.getName().equalsIgnoreCase("null")) this.everyGuests.add(guest);
			String s = new String();
			for (Room thing: rooms){
				if(thing.getRoomID().equals(room.getRoomID())){
					s = "continue";
				}
			}
			if (s.equalsIgnoreCase("continue"))continue;
			if (!room.getBusy()) {
				this.emptyRooms.add(room);
			} else this.guests.add(guest);
			this.rooms.add(room);			
		}
		return array2;
	}
	
	
	
	
	public void save(String[] values){
		fileWorker.writeToFile(values);
	}
	
}
