package com.class10;

import java.util.Scanner;

public class ScannerArrey {

		public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		/*read the array size from  the scanner
		 * create an array of number
		 * insert vaule of int from scanner
		 * print the sum of the all elements*/
		
		System.out.println("How many numbers do you want to enter");
		int size=scan.nextInt();
		int sum=0;
		int[] array= new int[size];
		for (int i=0; i<array.length; i++) {
			System.out.println("enter a number");
			array[i]= scan.nextInt();
		sum=sum+ array[i];
		}System.out.println(sum);
		}
		
}
