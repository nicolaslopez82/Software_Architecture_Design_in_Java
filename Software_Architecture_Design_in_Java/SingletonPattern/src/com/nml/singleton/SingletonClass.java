package com.nml.singleton;

public enum SingletonClass {

	INSTANCE;
	
	private int counter;
	
	public void setCounter(int counter){
		this.counter = counter;
	}
	
	public int getCounter(){
		return this.counter;
	}
}
