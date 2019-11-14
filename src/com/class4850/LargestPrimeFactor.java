package com.class4850;

import java.util.Scanner;

public class LargestPrimeFactor {

	public static void main(String[] args) {

		//En buyuk bolen
		/*Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		scan.close();
		int largest=0;
		if(num<0) {
			System.out.println("it is invalid number");
		}else {
			
			for(int i=2; i<=num; i++) {
				
				while(num%i==0) {
					num=num/i;
					largest=i;
				}
			}
			System.out.println(largest);	
		}*/
		//to calculate the sum of first and the last digits of an integer
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=scan.nextInt();
		scan.close();
		
		int last=0;
		
		if (num<0) {
			System.out.println("Invalid number");
		}else {
			int first=num%10;
			
			for(int i=0; i<=num; i++) {
				if (num>=10) {
					last=num/10;
					//num=num/10;
				}				
			}
			System.out.println(first);
			System.out.println(last);
			System.out.println(last+first);
		}
	}

}
