package com.nml.factory;

public class App {

	/**
	 * 
	 * Factory Pattern: helps to create loosely coupled OO designs !!!
	 * 
	 * 	WHAT IS THE PROBLEM WITH THE NEW KEYWORD?
	 * 
	 * 		We should not program to an implementation, we should program to an interface
	 * 			BUT every time we use 'new' keyword we do so !!!
	 * 
	 * 			- so when we instantiate a class that is definitely an implementation
	 * 			
	 * 			- tying our code to a concrete class: make our application
	 * 				more fragile and less flexible
	 * 			
	 * 			- in java -> if we program to an interface, our system will work for any class
	 * 				implementing that interface ( because of polymorphism )
	 * 
	 * 
	 * 	The concrete new Dog() classes may have to be changed as new concrete classes
	 * 		are added: so our code will not be closed for modification 
	 * 			
	 * 			- we have to find the part in our code that will change -> separate it 
	 * 			- WE MAY ENCAPSULATE OBJECT CREATION 
	 * 
	 * 					We can do it with Factory Pattern !!! 
	 *
	 */
	
	public static void main(String[] args) {
		
		Algorithm algorithm = AlgorithmFactory.createAlgorithm(AlgorithmFactory.SPANNING_TREE);
		algorithm.solve();
		
	}
}
