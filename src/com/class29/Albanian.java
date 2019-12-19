package com.class29;

public class Albanian extends Human{
	String albanianId;
	public Albanian (String name, int age, int weight, String SSN) {
		super (name, age, weight);
		//this(name); bunlar zaten parent class da var
		//this.age=age;
		//this.weight=weight;
		this.albanianId=albanianId;
}
	@Override
	public String greeting() {
		
		return "Persenity";
	}
	@Override
	public void talk() {
		System.out.println("Une flass shqip."+albanianId);
		
	}
}
