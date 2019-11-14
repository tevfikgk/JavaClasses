package com.class9;

import java.util.Scanner;

public class ScannerForLoop {

	public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);
	System.out.println("please enter first number");
	int firstNumber=scan.nextInt();
	System.out.println("please enter second number");
	int secondNumber=scan.nextInt();
	int evenNumber=0;
	int oddNumber=0;
	for (int a=firstNumber; a<=secondNumber; a++) {
		
		if (a%2==0) {
			evenNumber=evenNumber+a;
			
		}else {
			oddNumber=oddNumber+a;
		
		}
		
		
	}
		System.out.println("Total of the even number between your number is " + evenNumber);
		System.out.println("Total of the odd number between your number is " + oddNumber);
		
    }
	}


