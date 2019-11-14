package com.class3;

import java.util.Scanner;

public class RadioCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		final double pi=3.14;
		System.out.println("Do you want to calculate perimeter or area?");
		String operation=scan.next();
		System.out.println("Please put the radius");
		int radius=scan.nextInt();
		if (operation.equals("perimeter")) {
			double perimeter= 2*pi*radius;
			System.out.println("Perimeter of circle is "+ perimeter);
		} else if (operation.equals("area")) {
			double area= pi*radius*radius;
			System.out.println("Area of circle is "+ area);
		}
			
		}
	}


