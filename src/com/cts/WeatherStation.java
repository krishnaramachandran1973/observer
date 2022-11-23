package com.cts;

import com.cts.devices.CurrentConditions;
import com.cts.devices.Forecast;
import com.cts.devices.StatisticsDisplay;

public class WeatherStation {
	public static void main(String[] args) {
		Subject weatherData = new WeatherData();
		Observer currentConditions = new CurrentConditions(weatherData);
		Observer forecast = new Forecast(weatherData);
		((WeatherData) weatherData).setMeasurements(32.f,15.0f,11.2f);
		
		Observer statistics = new StatisticsDisplay(weatherData);
		((WeatherData) weatherData).setMeasurements(25.f,20.0f,10.2f);
		
		currentConditions.unsubscribe();
		
		((WeatherData) weatherData).setMeasurements(25.f,20.0f,10.2f);
		
	}

}
