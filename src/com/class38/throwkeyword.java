package com.class38;

public class throwkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//create a method that if user is older than 18. If it is not you want to show an exception.
	
	public static void userAge (int age) {
		if (age>=18) {
			System.out.println("You can get driver license");
		}else {
			throw new RuntimeException("you must be older than 18"); 
		}
	}
}
