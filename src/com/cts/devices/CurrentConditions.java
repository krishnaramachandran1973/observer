package com.cts.devices;

import com.cts.Observer;
import com.cts.Subject;

//User - The Hindu - address of the office
public class CurrentConditions implements Observer {
	private Subject subject;

	public CurrentConditions(Subject subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}

	public void update(float temperature, float pressure, float humidity) {
		System.out.println("CurrentConditions display");
		System.out.println("Temp " + temperature);
		System.out.println("Pressure " + pressure);
		System.out.println("Humidity " + humidity);
		System.out.println("----------------");
	}
	
	public void unsubscribe() {
		this.subject.removeObserver(this);
	}
}
