package com.nml.designpaterns.state;

public class App {

	public static void main(String[] args) {
		
		Context context = new Context();
		
		State onState = new OnState();
		onState.doAction(context);
		System.out.println(context.getState().toString());
		
	}
}
