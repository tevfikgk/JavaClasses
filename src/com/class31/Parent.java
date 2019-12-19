package com.class31;

public class Parent {
	void hello() {
		System.out.println("Hello I am  a super class");
		
	}
}

class Child extends Parent{
	static void hello() {
		System.out.println("Hello I am  a child class");
	}
	
}
