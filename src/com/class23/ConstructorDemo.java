package com.class23;

public class ConstructorDemo {

	ConstructorDemo(){
		
		System.out.println("I am your constructor");
	}
	
	ConstructorDemo(String str){
		
		System.out.println("I am your constructor with one parametre "+str);
		
	}
	
		ConstructorDemo(int str){
		
		System.out.println("I am your constructor with one parametre "+str);
		}
	public void hello() {
		System.out.println("Hello Class");
		System.out.println("Hello Insructor");
	}
	public void hello(String str) {
			System.out.println("Hello1 Class");
			System.out.println("Hello1 Insructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorDemo obj=new ConstructorDemo();
		obj.hello();
		
		ConstructorDemo obj2=new ConstructorDemo("My Parameter");
		ConstructorDemo obj3=new ConstructorDemo(123);
		
	}

}
