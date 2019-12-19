package com.class37;

public class UncheckedExceptions {
public static void main(String[] args) {
	System.out.println("Beginnig  code");
	int a=20;
	int b=0;
	
	
	
	try {
		System.out.println(a/b); //new ArithmeticException();
		} catch(ArithmeticException e) {//ArithmeticException exception=new ArithmeticException();
		
	}
	
	System.out.println("End of the code");
	
}



}
