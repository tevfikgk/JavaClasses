package com.class8;

import java.util.Scanner;

public class GuestNumber2 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number between 1 and 20");
		
	for (int i=0; i<=20; i++) {
			int userNumber=scan.nextInt();
			int guestNumber=9;
			if (userNumber>guestNumber) {
				System.out.println("Your number is too large. Enter again");
			}else if (userNumber<guestNumber) {
				System.out.println("your number is too small. Enter again");
			} else System.out.println("conragulation you win");
		}
	}

}
