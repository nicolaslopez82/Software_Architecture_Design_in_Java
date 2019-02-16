package com.nml.designpaterns.state;

public class OnState implements State{

	@Override
	public void doAction(Context context) {
		System.out.println("This is on state...");
		context.setState(this);
	}

	@Override
	public String toString() {
		return "On state...";
	}
}
