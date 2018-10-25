package com.nml;

import java.util.ArrayList;
import java.util.List;

public class Cache {

	private List<Service> listOfServices;
	
	public Cache() {
		this.listOfServices = new ArrayList<>();
	}
	
	public Service getService(String jndiName) {
		
		// O(N) 
		for(Service s : listOfServices) {
			if( s.getName().equals(jndiName)) {
				return s;
			}
		}
		
		return null;
	}
	
	public void addService(Service service) {
		this.listOfServices.add(service);
	}
}
