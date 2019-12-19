package com.class29;

public class American extends Human{ //extend constructor u inherince etmiyor. bunun icin super olusturuyoruz.
	String SSN;
	
	public American (String name, int age, int weight, String SSN) {
		super (name, age, weight);
		//this(name); bunlar zaten parent class da var
		//this.age=age;
		//this.weight=weight;
		this.SSN=SSN;
	}
	
	public void taxReturns() {
		
	}

	@Override
	public String greeting() {
		
		return "Hello";
	}

	@Override
	public void talk() {
		System.out.println("I speak english");
		System.out.println("My SSN "+ SSN);
	}
}
