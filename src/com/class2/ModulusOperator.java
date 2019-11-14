package com.class2;

public class ModulusOperator {

	public static void main (String[] args) {
		float num1=12.5f;
		float num2=3.5f;
		float div= num1/num2;
		System.out.println(num1/num2);
		
		int number1=13;
		int number2=2;
		int divOfIntegers=number1/number2;// if you write double divOfIntegers the result will be 6.0
		System.out.println(divOfIntegers);
		
		double d=12;
		System.out.println(d);
		
		//modulus gives remaining of the devision
		int a=15;
		int b=2;
		int remainder=a%b;
		System.out.println(remainder);
		int myNumber=8+8%2;
		System.out.println(myNumber);
	}
}
