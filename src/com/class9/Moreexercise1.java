package com.class9;

import java.util.Scanner;

public class Moreexercise1 {

	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);	
	
	System.out.println("Enter row number");
	int row=scan.nextInt();
	
	System.out.println("Enter column number");
	int column=scan.nextInt();
	
	for(int i=1; i<=column; i++) {
		for (int k=1; k<=row+1; k++) {
			System.out.print("*");
		}System.out.println("");
	}
		

	}
	
	
}
