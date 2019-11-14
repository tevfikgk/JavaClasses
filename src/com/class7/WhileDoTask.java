package com.class7;

import java.util.Scanner;

public class WhileDoTask {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		double price;
		do {
			System.out.println("Please pay for soda");
			price=scan.nextDouble();
		}while(price!=1.99);
		
		System.out.println("Enjoy your soda");
	}

}
