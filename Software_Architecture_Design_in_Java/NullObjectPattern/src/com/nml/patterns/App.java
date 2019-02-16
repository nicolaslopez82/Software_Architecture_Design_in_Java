package com.nml.patterns;

public class App {

	/**
	 * Null Object Pattern
	 * 
	 * 	- motivation: references may be null !!!
	 * 	- it can be very elaborate to deal with null references
	 * 	- we have to check whether a reference is null or not -> NullPointerException
	 * 			if we call methods on null objects
	 * 
	 * 	GOOD TO AVOID NULL REFERENCES For example: return empty ArrayList instead of null ...
	 * 		Or we have to use several if() checks whether the reference is null
	 * 			For example: dealing with binary trees
	 * 
	 * 			class Node {
	 * 				
	 * 				private int data;
	 * 				private Node leftChild;
	 * 				private Node rightChild;
	 * 
	 * 				...
	 * 			}
	 * 	
	 * 	SOLUTION: the null object design pattern
	 * 
	 * 		We create an abstract class specifying various operations to be done
	 * 		 Concrete classes extending this class and a null object class providing
	 * 			 do nothing implemention of this class
	 * 				~ this approach can be used where we need to check null value !!!
	 * 
	 */
	
	public static void main(String[] args) {
		
		CustomerFactory customerFactory = new CustomerFactory();
		
		System.out.println( customerFactory.getCustomer("Joe").getPerson() );
		System.out.println( customerFactory.getCustomer("Joel").getPerson() );
		System.out.println( customerFactory.getCustomer("Daniela").getPerson() );
		System.out.println( customerFactory.getCustomer("Adam").getPerson() );
	}
}
