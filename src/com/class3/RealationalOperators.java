
package com.class3;

public class RealationalOperators {

	public static void main(String[] args) {
		
		int num1=20;
		int num2=19;
		
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println("*****************");
		
		double d=1.99;
		double d1=2.99;
		
		boolean k=d<d1;
		System.out.println(k);
		
		boolean b1=d<d1;
		boolean b2=d==d1;
		boolean b3=d!=d1;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		System.out.println("*****************");
		
		int a=90;
		int b=300;
		if (a>b) {
		System.out.println("a is larger than b");	
		} else {
			System.out.println("a is smaller than b");
		}
	int expectedHours=15;
	a=expectedHours;
	int actualHours=2;
	b=actualHours;
	if (a>b) {
		System.out.println("you will succeed");
	}else {
		System.out.println("please study more");
	}
	
	double teaPrice=4.99;
	double allowedPrice=3.99;
	teaPrice-=2;
	teaPrice-=3;
	
	
	if(allowedPrice>=teaPrice) {
		System.out.println("I will buy tea");
		System.out.println("and i will enjo my tea");
	} else {
		System.out.println("I cannot affort, I need to study more");
		System.out.println("i will go back to study more");
	}
	
	
	
	}

}
