package com.class18;

public class Hello {

	void sayHello(String name) {  ///*****methods with parametre
		System.out.println("Hello "+name);
	}
	
	public static void main(String[] args) {
		Hello obj=new Hello();
		obj.sayHello("Asel");
		obj.sayHelloDifLang("USA");
		obj.sayHelloDifLang("Russia");
		obj.sayNameAndAge("Jack", 45);
		
	}
		//create a method that will say hello in different lang
		void sayHelloDifLang(String country) {
			
			switch (country) {
			case "USA":
				System.out.println("Hello");
				break;
			case "Russia":
				System.out.println("Privet");
			break;
			default:
				System.out.println("I dont know");
			}
			}
		//method to say name and language
		void sayNameAndAge(String name,int age) {
			System.out.println("My anme is "+ name +" and I am "+age+ " years old");
		}
}
