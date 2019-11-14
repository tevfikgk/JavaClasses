package com.class5;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	boolean b1=!true;
	boolean b2=!false;
	
	System.out.println(b1);
	System.out.println(b2);
	
	
	boolean traffic=true;
	if(!traffic) {
		System.out.println("Hello");
	}else {
		System.out.println("Bye");
	}
	
	boolean isRain=false;
	if (!isRain) {
		System.out.println("take an umbrella");
	} else {
		System.out.println("no problem");
	}
	
	int num1=10;
	int num2=11;
	if (!(num1==num2)) {
		System.out.println("They are not equal");
	} else {
		System.out.println("Tey are equal");
	}
			
	String name="Marry";
	String name1="Anna";
			
	if (!(name.equals("Marry") || name.equals("Anna")))	{	
	System.out.println("You are my sister");
	} else {
		System.out.println("You are not my sister");
	}
		
}
}	

