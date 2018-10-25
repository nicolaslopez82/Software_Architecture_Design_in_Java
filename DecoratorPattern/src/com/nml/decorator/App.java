package com.nml.decorator;

/**
 * 
 * Important design principle -> classes should open for extension but closed
 * 			for modification !!!
 * 		
 * 				For example: ObserverPattern we can add new Observers + extend Subject	
 * 						 without adding code to Subject
 * 						 
 *  					+ DECORATOR PATTERN HELPS TO MAKE OPEN CLOSED
 *  						PRINCIPLE COME TRUE
 * 
 * 		- our goal is to allow classes to be easily extended with new behavior without
 * 				modifying existing code
 * 		- it is good -> FLEXIBLE !!!  if the requirements are changing we do not have to
 * 							rewrite the whole application 
 * 
 * 		- applying the open-closed principle everywhere can lead to hard to 
 * 				understand code !!!
 * 
 * 			---------------------------------------------------------------------------------------			
 * 
 * 		Decorator Pattern: attaches additional responsibilities to an object dynamically !!!
 *			Decorators provide a flexible alternative to
 *			  subclassing for extending functionality
 *
 *		For example: new LineNumberInputStream(new BufferedInputStream(new FileInputStream()));
 */

public class App {

	public static void main(String[] args) {

		Beverage milkWith2Sugars = new Sugar(new Sugar(new Milk(new PlainBeverage())));
		System.out.println(milkWith2Sugars.getCost());
		System.out.println(milkWith2Sugars.getDescription());
		
		
	}
}
