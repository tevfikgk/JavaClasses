package com.class27;

public class Animal {
	public static void whoAmI() {  //*********static
		System.out.println("I am an animal");
	}
	public static void main(String[] args) {
		Animal animal=new Monkey();
		animal.whoAmI(); //***************parent class i basar. so there is no overriding. We can not override overriding to static method
		//there is method hiding//******************************* child class not appears
	}
}
//********we can not override constructor***********

class Monkey extends Animal{
	//cannot override static methods
	// public void whoAmI(){}
	public static void whoAmI() {
		System.out.println("Iam a monkey");
	}
}

//Method Overriding;
//1.inheritence is must
//2.method signature and return type must be same
//3.Access modifiers can not be reduced but can be increased
//4.static can not overriden, they are riden
//5.constructor can not be overriden
//6.private method can not be overriden