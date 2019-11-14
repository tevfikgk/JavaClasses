package com.class2;

public class StringConcatenation {

	public static void main (String[] args) {
	
		int num1 = 3;
	    int num2 = 7;
	    int num3 = 5;
	    int num4 = 1;
	    
	    //start coding here
	    //System.out.println(num1*num2);
	    int divide;
	    divide=num1+num2;
	    int divide1;
	    divide1= divide-num3;
	    int divide2;
	    divide2=divide1-num4;
	    System.out.println("The result of the operations is equal to " + divide2);
	
	    String name=" Anna";
	//Display in Concole Good morning Anna
		
		System.out.println("Good morning"+name);
		
		int day=22;
		//Today is September 22
		
		System.out.println("Today is September " + day);
		
		String text="Today is September ";
		System.out.println(text + day);
		
		int num1=12;
		int num2=13;
		
		System.out.println("The value of number1= " + num1 + " and The value of number2= " + num2);
		
		String fruit="banana";
		char dollar= '$';
			double price=1.99;
			System.out.println("The price of " + fruit + " is " + dollar+price);
	}
}
