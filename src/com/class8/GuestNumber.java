package com.class8;

import java.util.Scanner;

public class GuestNumber {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number from 1 to 20");
		int guestNumber= scan.nextInt();
		int secretNumber=9;
		
		while (guestNumber!=secretNumber) { 
		if (guestNumber>secretNumber) {
			System.out.println("Your number is too large");
		} else if  (guestNumber<secretNumber) {
			System.out.println("Your number is too small");
			} 
		System.out.println("Enter again a number from 1 to 20");
		guestNumber= scan.nextInt();	
	 	
		}System.out.println("Conratulations");
		}
		}
		



