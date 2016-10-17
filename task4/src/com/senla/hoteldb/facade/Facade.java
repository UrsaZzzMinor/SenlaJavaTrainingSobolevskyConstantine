package com.senla.hoteldb.facade; // getting lists from dao?


import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.senla.hoteldb.models.Guest;
import com.senla.hoteldb.models.Room;

public class Facade {
	private String[][] array;
	public String[][] getArray() {
		return array;
	}

	public void setArray(String[][] array) {
		this.array = array;
	}

	public void settleIntoRoom(int index, Guest guest){
		array[index][5] = guest.getName();
		array[index][6] = guest.getSurName();
	}
	
	public void departureFromRoom(int index, Guest guest, String s){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy,mm,dd");
		try {
			array[index][7] = sdf.format(sdf.parse(s));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void changeRoomStatus(){
		
	}
	
	public void changeRoomPrice(int index, Room room){//add room index for using Room room as an entry parameter
		array[index][1] = room.getPrice().toString();
	}
	
	public void changeServicePrice(int index, Guest guest){// -//-
		array[index][10] = guest.getPrices().get(0).toString();
	}
	
	public void addRoom(int index, Room room){
		for (int i=0; i < 5; i++ )
		array[index][1] = room.getRoomID().toString();
				
	}
	public String[] convertArray(){
		int n = array[0].length;
		String[] arr = new String[225];
		for (int i=0; i<array.length; i++){
			
			for (int j=0; j < n; j++){
				arr[i*n+j] = array[i][j];
			}
		}
		return arr;
			
	}
}
