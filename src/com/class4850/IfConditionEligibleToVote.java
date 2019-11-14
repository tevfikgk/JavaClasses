package com.class4850;

import java.util.Scanner;

public class IfConditionEligibleToVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Write Java program to allow the user to input his/her age. Then the program will show if the person is eligible to vote. A person who is eligible to vote must be older than or equal to 18 years old.

		Enter your age: 18

		You are eligible to vote*/
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter your age");
		
		int userAge=scan.nextInt();
		
		if (userAge>=18) {
			System.out.println("You are eligible to vote");
		} else {
			System.out.println("You are not eligible to vote");
		}
		
		
	}

}
