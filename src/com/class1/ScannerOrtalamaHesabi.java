package com.class1;

import java.util.Scanner;

public class ScannerOrtalamaHesabi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double  pi=3.14159;
		
		Scanner scan= new Scanner(System.in);	
		System.out.println("Please enter yaricap");
		double yaricap;
		yaricap= scan.nextDouble();
	    double alan=yaricap*yaricap*pi;
System.out.println("Alan= "+ alan);
	
	
	}
	}                            
