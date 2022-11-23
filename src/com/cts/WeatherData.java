package com.cts;

import java.util.ArrayList;
import java.util.List;

// Newpaper - multiple users
// multiple devices
// loose coupling
public class WeatherData implements Subject {
	// One Subject has dependency on - Many Observers
	// One-to-many dependency
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		this.observers = new ArrayList<>();
	}
// some iot deice will update the measurements
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measurementsChanged();
	}

	public void measurementsChanged() {
		this.notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		this.observers.add(observer);

	}

	@Override
	public void removeObserver(Observer observer) {
		this.observers.removeIf(ob -> ob.equals(observer));

	}

	@Override
	public void notifyObservers() {
		this.observers.forEach(ob -> ob.update(temperature, pressure, humidity));

	}

}
