package com.class30;



public abstract class Vehicle {
	String vinNumber;
	
	Vehicle (String vinNumber){
		this.vinNumber=vinNumber;
	}
	public void drive() {
		System.out.println("Vehicle can drive");
	}
	public void stop() {
		System.out.println("vehicle can stop");
	}
public abstract void start();
public abstract void speed();
}

abstract class Car extends Vehicle{ 
	String carType;
	Car(String vinNumber, String carType){
		super(vinNumber);
		this.carType=carType;
	}
	public void speed() {
		System.out.println("Max car speed up to 400");
	}
	public abstract void breaking(); // parent class dan gelmiyor child classa sonradan biz ekledik //********* bu eklendigi icin line 29 a da acilmak zorunda kaldi
}
class BMW extends Car{
	String make, model;
	BMW (String vinNumber, String carType,String make, String model){
		super(vinNumber, carType);
		this.make=make;
		this.model=model;
	}
	
	@Override
	public void start() {	
	}
	@Override
	public void breaking() {	
	}
	public void display() {
		System.out.println("we built "+make+" "+model+" with vin# "+vinNumber);
	}
}
