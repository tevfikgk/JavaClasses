package com.class2;

public class ArithmeticOperations {
/*
 * declare  2 variables and initialize them
 * diplay result of addition, substraction, multiplication and devision
 */
	
	public static void main (String[] args) {

		int num1, num2;
		num1=20;
		num2=10;
		
		System.out.println(num1+num2); //
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		
		// how can we print value of num1 and num2 togetler
		System.out.println(num1 + " " +num2);
		
		int sum=num1+num2;
		int sub=num1-num2;
		int mult=num1*num2;
		int div=num1/num2;
		// the addition/substraction... of 2 numbers is_
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
		
}
}
