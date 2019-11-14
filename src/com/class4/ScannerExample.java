package com.class4;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter any number");
	/*nexInt(); -- for numbers
	 * nextLine(); for strings
	 * nextDouble(); --double
	 */
	int number=scan.nextInt();
	System.out.println("Enter number is "+ number);
	
	
	System.out.println("*************************************");
	
	Scanner input=new Scanner(System.in);
	System.out.println("Please Enter First Name");
	input.nextLine();
	System.out.println("Please Enter Surname");
	
	
	
	Scanner model=new Scanner(System.in);
	System.out.println("Enter a number");
	int bold=model.nextInt();
	System.out.println("Your number is "+bold);
	
	
	
	}

}
