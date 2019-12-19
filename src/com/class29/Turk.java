package com.class29;

public class Turk extends Human{
	String tCNumber;

	public Turk (String name, int age, int weight, String SSN) {
		super (name, age, weight);
		//this(name); bunlar zaten parent class da var
		//this.age=age;
		//this.weight=weight;
		this.tCNumber=tCNumber;
		
	}
}
