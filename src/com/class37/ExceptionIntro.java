package com.class37;

public class ExceptionIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b=0;
		System.out.println(a/b);
		System.out.println("continues code");
		
		ArithmeticException exception=new ArithmeticException();
		throw(exception);
	}

}
