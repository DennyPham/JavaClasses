package com.class17;

public class Car {
	// define attributes/features
	String make, model, color;
	int year,wheels,windows, speed;
	
	void drive() {
		System.out.println("This "+make+"'s"+" top speed is "+speed);
	}
	void start() {
		System.out.println("Car can start");
	}
	void accelerate() {
		System.out.println("car"+make+" can accelerate");
	}
	
	
	String getColor() {
		return color;
		
	}
	

	
}
