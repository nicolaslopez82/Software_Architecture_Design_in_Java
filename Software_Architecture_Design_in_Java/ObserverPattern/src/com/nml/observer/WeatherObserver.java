package com.nml.observer;

public class WeatherObserver implements Observer, DataPresenter {

	private int pressure;
	private int temperature;
	private int humidity;
	private Subject subject;
	
	public WeatherObserver(Subject subject){
		this.subject = subject;
		this.subject.addObserver(this);
	}
	
	@Override
	public void update(int pressure, int temperature, int humidity) {
		this.pressure = pressure;
		this.temperature = temperature;
		this.humidity = humidity;
		
		showData();
	}

	@Override
	public void showData() {
		System.out.println(this.pressure+"-"+this.temperature+"-"+this.humidity);
	}
}
