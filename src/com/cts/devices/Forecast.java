package com.cts.devices;

import com.cts.Observer;
import com.cts.Subject;

public class Forecast implements Observer {

	private Subject subject;

	public Forecast(Subject subject) {
		this.subject = subject;
		this.subject.registerObserver(this);
	}

	public void update(float temperature, float pressure, float humidity) {
		System.out.println("Forecast display");
		System.out.println("Temp " + temperature);
		System.out.println("Pressure " + pressure);
		System.out.println("Humidity " + humidity);
		System.out.println("----------------");
	}
	
	public void unsubscribe() {
		this.subject.removeObserver(this);
	}

}
