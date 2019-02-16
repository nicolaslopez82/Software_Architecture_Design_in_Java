package com.nml.solid;

public class App {

	/**
	 
	 O  ->  OPEN/CLOSED PRINCIPLE
	 
	 ------------------------------------------------------------------------------------------
	 
	 What is the MOTIVATION behind SOLID principles?
	 	An application should take care of the frequent changes that are done
	 	 		during the development and the maintaining phase of an application
	 	 				For example: new functionalities have to be added !!!
	 	 				
	 	 		 Those changes in the existing code should be minimized
	 	 		  WHY? It's assumed that the existing code is already unit tested and
	 	 		   changes in already written code might affect the existing functionality in an unwanted manner.
	 	 		   
	 -------------------------------------------------------------------------------------------

	Open closed principle states that the design and writing of the code should be done
	 in a way that new functionality should be added with minimum changes in the existing code
	 	WE SHOULD KEEP AS MUCH EXISTING CODE UNCHANGED AS POSSIBLE !!!

		- software entities should be open for extension, but closed for modification
	 		We have to design every new module -> if we add a new behavior, we
	 			do not have to change the existing modules 
	
		- closely related to the single responsibility principle !!!
	
		- a class should not extend an other class explicitly
			We should have a common interface
				Why? Because we can change the classes at runtime due to
						the common interface !!!

			For example: we want to show a progress dialog but it can due to 
				some download or loading of some music etc ...
						We want to decide at runtime why we want to show
							the dialog

		- we can make sure this principle is not violated:
			1.) strategy pattern
			2.) template pattern
	  
	 */
	
	public static void main(String[] args) {
		
		SorterManager sorterManager = new SorterManager();
		sorterManager.sort(new Quicksort());
		
	}
}
