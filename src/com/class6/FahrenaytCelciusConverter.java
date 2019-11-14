package com.class6;

import java.util.Scanner;

public class FahrenaytCelciusConverter {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter fahrenheit");
	double inFahrenheit=0.0;
	inFahrenheit=scan.nextDouble();
	double celsius;
	celsius=(inFahrenheit-32)*5/8;
	
	System.out.println("Celsius value is " +celsius);
	
	
}
}
