package com.nml.solid;

public class App {

	/**
	 * I -> INTERFACE SEGREGATION PRINCIPLE   SOLID
	 * 
	 * 	---------------------------------------------------
	 * 
	 * 		What is the motivation?
	 * 			We can have an abstraction of the system using interfaces
	 * 
	 * 			List<String> l = new ArrayList<>();
	 * 
	 * 				Sometimes --> we want to implement that interface but just for the sake
	 * 					of some methods defined in by that interface
	 * 						BUT we have to implement all the methods
	 * 								"fat interfaces"
	 * 
	 * ----------------------------------------------------
	 * 
	 * - it is about business logic to clients communication - it is not good if
	 *       an interface contains lots of methods
	 *       	 We should separate them accordingly
	 * 
	 * - The interface-segregation principle (ISP) states that no client should be
	 *      forced to depend on methods it does not use !!!
	 * 
	 * - when we can, we should break our interfaces in many smaller ones, so they
	 *    better satisfy the exact needs of our clients
	 *    
	 */
	
	public static void main(String[] args) {
		
		Tree binraySearchTree = new BinarySearchTree();
		Tree balancedTree = new BalancedTree();
		
	}
}
