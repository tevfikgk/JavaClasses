package com.class4850;

import java.util.Scanner;

public class Calculating {
public static void main(String[] args) {
	
	/*Exercise 2: Write Java program to allow the user to input the amount of deposit, yearly interest rate (percentage), and income tax(percentage). Then the program will calculate the amount of interest that the person earns in the year. See the example output below:

		The amount of deposit: 1000

		Yearly interest rate: 7.5%

		Income tax rate: 4%

		The amount of interest earned in the year:71.0*/
	
	
	Scanner scan=new Scanner(System.in);
	int amountOfDeposit;
	System.out.println("Please enter amount of deposit ");
	amountOfDeposit=scan.nextInt();
	double interestRate;
	System.out.println("Please enter interest rate ");
	interestRate=scan.nextDouble();
	double incomeTaxRate;
	System.out.println("Please enter tax rate ");
	incomeTaxRate=scan.nextDouble();
	
	double amountOfEarnedInterest= (amountOfDeposit*interestRate-amountOfDeposit*incomeTaxRate)/100;
	System.out.println("You earn yearly "+ amountOfEarnedInterest);
	
	
	
	
}
}
