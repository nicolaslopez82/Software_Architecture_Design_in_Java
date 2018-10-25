package com.nml;

public class ServiceLocator {

	private static Cache cache = new Cache();
	
	public static Service getService(String jndiName) {
		
		Service service = cache.getService(jndiName);
		
		if( service != null ) return service;
		
		InitialContext context = new InitialContext();
		Service s = (Service) context.lookup(jndiName);
		cache.addService(s);
		
		return s;
	}
	
}
