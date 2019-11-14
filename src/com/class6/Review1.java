package com.class6;

import java.util.Scanner;

public class Review1 {

	public static void main(String[] args) {

		//Write a program with one int value for salary and four String values for different cars
        //If you make over 50000 a year, you may buy a brand new car otherwise you should buy a used car. For those you can afford a new car there are different price ranges
        //I want anything under 70k to be Audi A5
        //I want anything under 80k to be Mercedes-Benz
        //I want anything under 90k to be Jaguar
        //I want anything under 100k to be Tesla
        // And if you make less than 60k output to read "Save up money and wait until next year"
		
		Scanner scan=new Scanner (System.in);	
		System.out.println("Please enter your salary");
		
		int salary=scan.nextInt();
		String car=null;
		if (salary>=50000) {
			System.out.println("you may buy a brand new car");
			if (salary>60000 && salary<=70000) {
				car="Audi5";
			}if (salary>=70000 && salary<80000) {
				car="Mercedes-Benz";
			}if (salary>=80000 && salary<90000) {
				car="Jaguar";
			}if (salary>=90000 && salary<100000) {
				car="Tesla";
			}if (salary<60000) {
				car="car next year";
				System.out.println("Save up money until next year");
			} else {
				car= "luxury car";
				System.out.println("You can buy whichever you want");
			}
		}else {
			System.out.println("you should buy a used car");
		}
		System.out.println("I want to buy a "+car);
	}

}
