package com.nml.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

	private int pressure;
	private int temperature;
	private int humidity;
	private List<Observer> observersList;
	
	public WeatherStation(){
		this.observersList = new ArrayList<>();
	}
	
	@Override
	public void addObserver(Observer o) {
		this.observersList.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		this.observersList.remove(observersList.indexOf(o));
	}

	@Override
	public void notifyAllObservers() {
		for(Observer observer : this.observersList){
			observer.update(pressure, temperature, humidity);
		}
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
		notifyAllObservers();
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
		notifyAllObservers();
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
		notifyAllObservers();
	}
}
