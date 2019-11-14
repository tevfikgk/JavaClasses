package com.class3;

import java.util.Scanner;

public class NumberCompareScannerIf {

public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter first number");
	int firstNumber=scan.nextInt();
	
	System.out.println("Please enter second number");
	int secondNumber=scan.nextInt();
	
	if (firstNumber>secondNumber) {
		System.out.println(firstNumber+ " is larger than "+ secondNumber);
		} else if (firstNumber<secondNumber) {
		System.out.println(secondNumber+ "is larger than "+ firstNumber);
		}else {
		System.out.println("Numbers you insert are equal");
		}
}
}
