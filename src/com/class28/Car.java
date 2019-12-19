package com.class28;

public class Car {

	String make, model;
	Car(){
		System.out.println("I am a non argument constructor");
	}	
	Car(String make, String model){
		this.make=make;
		this.model=model;
	}
}

class Tesla extends Car{
	boolean autopilot;
	
	Tesla (){
		//super(); even you dont write this it was created. so firstly print parent class and then child class
		
		System.out.println(" I am a child non argument constructor");
	}
	Tesla (String make, String model, boolean autopilot){
		super(make, model); //bunu yazmazsak make ve model null olur. constructor initialize etmek icin
		this.autopilot=autopilot;
	}

	public void displayInfo() {
		System.out.println("Car "+make+" "+model+" has an autopilot "+autopilot);
	}

}
	

