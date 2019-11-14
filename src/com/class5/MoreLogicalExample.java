package com.class5;

import java.util.Scanner;

public class MoreLogicalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	Scanner scan= new Scanner(System.in);
	System.out.println("Please enter your daily sales");
	double dailysales;
	double commision;
	dailysales= scan.nextDouble();
	if (dailysales<1000) {
		commision=dailysales*0.1;
		
	}else if (dailysales>=1000 && dailysales<2000) {
		commision=dailysales*0.2;
		
		} else if (dailysales>=2000) {
		commision=dailysales*0.5;
			
		} else {
		commision=0;}
	System.out.println("Your commisison " + commision);
	
	}
}
