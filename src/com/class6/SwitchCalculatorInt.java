package com.class6;

import java.util.Scanner;

public class SwitchCalculatorInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("What is the operation type?");
		String calculator=scan.nextLine();
		System.out.println("Please enter first number");
		int firstNumber=scan.nextInt();
		System.out.println("Please enter second number");
		int secondNumber=scan.nextInt();
		
		int result =0;
		switch (calculator) {
		
		case ("add"):
			result=firstNumber+secondNumber;
		break;
		
		case ("extraction"):
			result=firstNumber-secondNumber;
		break;
		
		case ("multiple"):
			result=firstNumber*secondNumber;
		break;
		
		case ("division"):
			result=firstNumber/secondNumber;
		break;
		
		}
		
		System.out.println("Your operation is " + calculator + " and "+ " result is "+ result);	
	}

}
