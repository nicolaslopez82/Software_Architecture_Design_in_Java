package com.nml.patterns;

import java.util.ArrayList;
import java.util.List;

public class Database {

	private List<String> customerNames;
	
	public Database(){
		this.customerNames = new ArrayList<>();
		this.customerNames.add("Daniel");
		this.customerNames.add("Adam");
		this.customerNames.add("Michael");
		this.customerNames.add("Joe");
	}

	public boolean existCustomer(String name) {
		
		for(String customer : this.customerNames){
			if( customer.equals(name)){
				return true;
			}
		}
		
		return false;
	}
}
