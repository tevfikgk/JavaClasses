package com.class10;

import java.util.Scanner;

public class Review3 {

	public static void main(String[] args) {

		
		
		int expenses[]=new int[4];
		
		for (int i=0; i<expenses.length; i++) {
		System.out.println("Enter your" +(i+1)+ " number");
		Scanner scan=new Scanner(System.in);
		expenses [i]=scan.nextInt();
		}
		int sum=0;
		for (int k=0; k<expenses.length; k++) {
			sum=sum+expenses[k];
		}
		System.out.println(sum);
		
		
		/*int [] a= {4,5,7,2,9};
		int sumA=0;
		for (int i=0; i<a.length; i++) {
			sumA=sumA+a[i];
		}System.out.println(sumA);*/
		
	}

}
