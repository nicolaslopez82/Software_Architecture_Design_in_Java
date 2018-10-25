package com.nml.solid;

public class DatabaseHandler {

	private Database database;
	
	public DatabaseHandler(Database database) {
		this.database = database;
	}
	
	public void connect() {
		this.database.connect();
	}
	
	public void disconnect() {
		this.database.disconnect();
	}
}
