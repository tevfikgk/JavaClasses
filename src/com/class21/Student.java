package com.class21;

public class Student {

	public String studentName;
	public double GPA;
	public String school;
	
	
	
	public void displayInfo(){
	System.out.println(studentName+" is attending "+ school+" " + GPA+ " .");
}
	protected void study (int hours) {
		System.out.println("Studying for "+ hours +" hours.");
	}
}
