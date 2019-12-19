package com.class22;

public class StaticVsNonStatic {

	
	static String school="Syntax";
	String name;
	char grade;
	
	void getInfo() {
		System.out.println("My name is "+name+" and I am going to " +school+" and my grade is "+ grade);
	}
	
	static void getInfo1() {
		System.out.println(" I am  attending classes at "+school);
	}
	
	
	
	
}
