package com.class4850;

import java.util.Scanner;

public class SwitchCorrectAnswer {

	public static void main(String[] args) {

		/*What is the correct way to declare a variable to store an integer value in Java?
				a. int 1x=10;
				b. int x=10;
				c. float x=10.0f;
				d. string x="10";
				Enter your choice: c*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("What is the correct way to declare a variable to store an integer value in Java?");
		
		System.out.println("a. int 1x=10;");
		System.out.println("b. int x=10;");
		System.out.println("c. float x=10.0f;");
		System.out.println("d. string x=\"10\";");
		
		char answer=scan.next().charAt(0);
		
		switch (answer) {
		
		case 'a':
			System.out.println("Sorry, wrong answer");
		break;
		case 'b':
			System.out.println("Yes, true answer");
		break;
		case 'c':
			System.out.println("Sorry, wrong answer");
		break;
		case 'd':
			System.out.println("Sorry, wrong answer");
		break;
		default:
		System.out.println("please choose one of them");
		
		}
		
		
		
		
		
		
		
	}

}
