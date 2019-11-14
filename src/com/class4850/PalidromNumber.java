package com.class4850;

import java.util.Scanner;

public class PalidromNumber {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		int lastnum=num;
		int reverse=0;
		int lastDigit=0;
		while(num!=0) {
			lastDigit=num%10;
			
			reverse=reverse*10+lastDigit;
			num=num/10;
			
			
			
		}
			System.out.println(reverse);	
			
			
			if(lastnum==reverse) {
				
				System.out.println("it is polindrom");
			}
			else {
				System.out.println("it is not polindrom");
			}
			
		
	/*	Scanner scan= new Scanner(System.in);
		System.out.println("Enter a bumber to check palindrome or not");
		int num = scan.nextInt();
		int reverse = 0;
		
		int a = num;
		
         while(a>0) {
			
			int remeinder = a%10;
			reverse =reverse*10+remeinder;
			a= a/10;
		}
		System.out.println(reverse);
		
		
		if(reverse == num) {
			System.out.println(num+ " is a palindrome number");
		}else {
			System.out.println(num+" is not a palindrome number");
		}*/
	}

}
