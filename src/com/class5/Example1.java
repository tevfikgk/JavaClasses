package com.class5;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int day=1;
	
	if (day>=1 && day<=5) {
		System.out.println("It is a weekday");
	}else if (day==6 || day==7) {
		System.out.println("It is a weekday");
	}else {
		System.out.println("It is not valid");
	}
	
	System.out.println("-----------------------------");
	
	Scanner personHeights = new Scanner(System.in);
	System.out.println("Please enter your heights");
	double personClass = personHeights.nextDouble();
	
    if (personClass < 5 ) {
    	System.out.println("you are short");
    } else if (personClass >=5 || personClass<=6) {
    	System.out.println("you are medium");
    } else if (personClass>6) {
    System.out.println("you are tall");
    } else System.out.println("invalid");
    
	
	
	}

}
