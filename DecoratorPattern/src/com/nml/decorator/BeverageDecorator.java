package com.nml.decorator;

public abstract class BeverageDecorator implements Beverage {
	
	private Beverage beverage;
	
	public BeverageDecorator(Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public int getCost() {
		return this.beverage.getCost();
	}
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription();
	}
}
