package com.class7;

import java.util.Scanner;

public class LoopScanner {

	public static void main(String[] args) {

		
		int sayi=5;
		Scanner scan=new Scanner(System.in);
				
		while (sayi<10); {
			
			System.out.println("Please enter your name");	
			String name=scan.nextLine();
			System.out.println("Good afternoon" +name);
			sayi+=1;
		}
	 
	}

}
