package com.senla.hoteldb.database;

import com.danco.training.TextFileWorker;

public class DB {
	private final String path = "resources/hotelDB.txt";
	private TextFileWorker fileWorker = new TextFileWorker(path);
	private String[] hotelDB;
	
	public void loadDB(){
		hotelDB = fileWorker.readFromFile();
	}

	public String[] getHotelDB() {
		return hotelDB;
	}
	
	public void saveDB(String[] array) {
		fileWorker.writeToFile(array);
	}
}
