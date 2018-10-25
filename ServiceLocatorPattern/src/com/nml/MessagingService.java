package com.nml;

public class MessagingService implements Service {

	public static final String NAME = "messagingService";
	
	@Override
	public String getName() {
		return MessagingService.NAME;
	}

	@Override
	public void execute() {
		System.out.println("Executing messaging service...");
	}
}
