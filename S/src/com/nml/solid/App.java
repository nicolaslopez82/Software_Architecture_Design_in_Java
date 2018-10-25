package com.nml.solid;

public class App {

	/**
	 * S  <-->  SINGLE RESPONSIBILITY PRINCIPLE  
     *
	 *	- a software entity (class, method) should have only one reason to change
	 *	- if a class or a method does more than one procedure, 
	 *		it is advisable to separate it into two distinct classes/methods
	 *	- it can be done easily with the help of interfaces !!!
	 *
	 *	So if we have 2 reasons to change for a class -> we should split the functionality 
	 *		into two separate classes
	 *			EACH CLASS WILL HANDLE A SINGLE RESPONSIBILITY !!! 
	 *
	 *	- it leads to a low coupled design with less and lighter dependencies
	 *	
	 */
	
	public static void main(String[] args) {
		
		Book book1 = new Book("Albert Camus", 120);
		book1.save();
		
	}
}
