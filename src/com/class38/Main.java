package com.class38;

class Main {
	  public static void main(String[] args) {
	     int a=10;
	     int b=0; 
	     int result=0;
	     try{
	     result = a/b;
	     System.out.println(result);
	     } catch (ArithmeticException e) {
			 System.out.println(e.getMessage());	
	     }
	  }
	}