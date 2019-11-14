package com.class4850;

import java.util.Scanner;

public class IfConditionEvenOrOdd {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int userNumber=scan.nextInt();
		
		if (userNumber%2==0) {
			System.out.println("Your number is an even number");
		} else {
			System.out.println("Your number is an odd number");
		}
		
		
	}
	
	
}
