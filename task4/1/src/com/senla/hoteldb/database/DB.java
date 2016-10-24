package com.senla.hoteldb.database;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
	
}
