package com.nml.solid;

public class App {

	/**
	 * D -> DEPENDENCY INVERSION PRINCIPLE
	 * 
	 * ----------------------------------------------------
	 * 
	 * What is the MOTIVATION?
	 * 
	 * When we develop a software or an application First we create the low
	 * level modules --> bluetooth communication, XML parser, disk access,
	 * database connection Second ---> we implement the high level modules that
	 * rely heavily on the low level ones
	 * 
	 * 
	 * HIGH LEVEL MODULES
	 * 
	 * ^ | |
	 * 
	 * 
	 * LOW LEVEL MODULES
	 * 
	 * 
	 * THIS IS THE INTUITION ... BUT ITS NOT GOOD
	 * 
	 * What if we want to replace a low level module? We have to change the
	 * whole high level implementation as well For example: connect to Oracle
	 * instead of MySQL OR want to store data in XML instead of CSV
	 * 
	 * Conclusion: high level modules should not depend on low level modules We
	 * have to use abstraction and an abstract layer between the low and high
	 * level modules
	 * 
	 * HIGH LEVEL MODULES <---> ABSTRACT LAYER (INTERFACES) <---> LOW LEVEL
	 * MODULES !!!
	 * 
	 * 
	 * ----------------------------------------------------
	 * 
	 * - very difficult to apply: but it is the most important principle
	 * 
	 * - high level modules should not depend on low level modules... Both
	 * should depend on abstraction !!! Abstraction should not depend on
	 * detail... Details should depend upon abstraction !!!
	 * 
	 * Dog dog = new Dog();
	 * 
	 * create Animal interface
	 * 
	 * Animal dog = new Dog();
	 * 
	 */

	public static void main(String[] args) {
			
		DatabaseHandler databaseHandler = new DatabaseHandler(new OracleDatabase());
		databaseHandler.connect();
		databaseHandler.disconnect();
		
	}
}
