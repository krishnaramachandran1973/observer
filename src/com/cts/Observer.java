package com.cts;

// User
public interface Observer {
	// your home address
	void update(float temperature, float pressure, float humidity);
	void unsubscribe();
}
