package com.class3;

public class DoubleComparation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	double x=8.5;
	double y=7.5;
	
	if(x>y) {
		System.out.println("Double value x is larger than y");
	}else {
		System.out.println("Double value x is smaller than y");
	}
	
	int roomTemperature=28;
	
	if(roomTemperature<32) {
		System.out.println("Water will freeze with temperature");
	}else {
		System.out.println("Water will not freeze with temperature");
	}
	
	
	boolean val=false;
	if(val) {                       //if(val) means if(val==true)
		System.out.println("Hello");
	}else
		System.out.println("bye");
			
	boolean isRain=true;
	// if it is raining i will take umbrella, otherwise i go for a walk
	if(isRain) {
		System.out.println("I will take umbrella");
	}else 
		System.out.println("i go for a walk");
	
	}

}
