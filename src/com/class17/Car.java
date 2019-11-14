package com.class17;

public class Car {
///NOW WE ARE IN TEMPLATE
		//define attributes/features
	String make, model, color;
	int year, wheels, windows, speed;
	
		//adding behaviour/ action--> methods();
	void drive() {
		System.out.println("Car "+make+ " can drive"); //for car1 Tesla; for car2 BMW
	}
	
	void start() {
	System.out.println("Car "+make+" can start");	
	}
	
	void accelerate() {
		System.out.println("Car "+make+" can accelerate");
	}
	
}
