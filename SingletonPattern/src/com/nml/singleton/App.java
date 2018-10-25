package com.nml.singleton;

public class App {

	public static void main(String[] args) {
		
		SingletonClass.INSTANCE.setCounter(10);	
		System.out.println(SingletonClass.INSTANCE.getCounter());
		
	}
}
