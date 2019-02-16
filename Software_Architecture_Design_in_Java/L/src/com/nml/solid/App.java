package com.nml.solid;

	/**
	  L  ->  LISKOV SUBSTITUTION PRINCIPLE 
	  
	  ----------------------------------------------
	  
	  	What is the motivation of Liskov principle?
	  		We usually create class hierarchies during the application development
				For example: we extend some classes creating some derived classes !!!
							
				
				It would be great if the new derived classed would work as well
					without replacing the functionality of the classes
					
					Otherwise the new classes can produce undesired effects when they are
					 	used in existing program modules.
	  
	  --------------------------------------------------

	- child classes should never break the parent class type definition
	
	- Let q(x) be a property provable about objects x of type T. Then q(y) should be provable for objects 
		y of type S where S is a subtype of T
			
	- subtypes must be substitutable for their base types
		( derived types must be completely substitutable for their base types )
		
		We have to make sure there will be no problems using the subtype or
			the original class
				Do not break functionality !!! we can call the methods anyway
	
	- we can solve it with the help of Template Pattern
	- it is not independent from Open Close Principle + interface segregation principle
		The violation of Liskov principle is a latent violation of Open Closed Principle !!!
		
	 */
	

	public class App {

		public static void main(String[] args) {
			
			ElectricCar car = new ElectricCar();
			
			car.chargeBattery();

		}
	}

