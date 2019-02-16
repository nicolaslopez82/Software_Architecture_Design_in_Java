package com.nml.view;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class App {

	/**
	 * 	MVC Pattern: we can separate the application with the help of this pattern
	 * 	  Why is it good? if we want to add extra features it can be done very very easily !!!
	 * 
	 * 		- Model: represents an object or a class carrying data. 
	 * 				It can also have logic to update controller if its data changes.
	 * 		
	 * 		- Controller: acts on both model and view
	 * 			 It controls the data flow into model object 
	 * 					and updates the view whenever data changes. 
	 * 				It keeps view and model separate
	 * 
	 * 		- View: represents the visualization of the data that model contains
	 * 
	 */
	
	public static void main(String[] args) {

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MainFrame();
			}
		});
	}
}
