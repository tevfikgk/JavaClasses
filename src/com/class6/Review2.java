package com.class6;

import java.util.Scanner;

public class Review2 {
public static void main(String[] args) {
	
	
	
	Scanner scan=new Scanner(System.in);
	System.out.println("How is the weather?");
	boolean goodWeather=true;
	int temperature;
	temperature=scan.nextInt();
	
	
	if (goodWeather==true) {
		System.out.println("What is the temperature?");
		if (temperature>=60 && temperature<100) {
			System.out.println("weather is inclusive unless it is raining");
		} else if(temperature<60) {
			System.out.println("it is too cold");
		} else if(temperature>=100) {
			System.out.println("it is too hot");
		}
	}else {
		System.out.println("stay at home");
	}
	
	
	
	
}
}
