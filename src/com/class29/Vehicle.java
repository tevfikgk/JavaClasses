package com.class29;

public abstract class Vehicle {
	public void drive() {
		System.out.println("VEhicle can drive");
	}
	public void stop() {
		System.out.println("vehicle can stop");
	}
public abstract void start();
public abstract void speed();
}

abstract class Car extends Vehicle{ //2 abstract method dan birini aldik digerini almadik bunun icin class i abtract yapmak zorundayiz
	public void speed() {
		System.out.println("Max car speed up to 400");
	}
	public abstract void breaking(); // parent class dan gelmiyor child classa sonradan biz ekledik //********* bu eklendigi icin line 29 a da acilmak zorunda kaldi
}
class BMW extends Car{
	@Override
	public void start() {	
	}
	@Override
	public void breaking() {	
	}
}
//bir class %100 implemented olmadan object uretilemez //*********************************** yani sadece BMW Class exercise edilebilir
//abstract class can not be private can not be final can not be Static
