package com.class6;

import java.util.Scanner;

public class Test3Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter number 1");
	int number1;
	number1=scan.nextInt();
	System.out.println("Enter number 2");
	int number2;
	number2=scan.nextInt();
	System.out.println("Enter number 3");
	int number3;
	number3=scan.nextInt();
	int largestNumber=0;
	if (number1>number2 && number1>number3) {
		largestNumber=number1;
	}else if(number2>number1 && number2>number3){
	largestNumber=number2;
	}else if (number3>number1 && number3>number2)
	{largestNumber=number3;
	}
	 System.out.println("the largest number is "+ largestNumber);
	}

}
