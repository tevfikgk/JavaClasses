package com.class5;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
	/*Scanner firstNumber=new Scanner(System.in);
	System.out.print("Please write your name");
	String name1=firstNumber.nextLine();
	System.out.println("Merhaba " + name1);
	
	System.out.println("...............................");*/
	
	boolean isDisplayed=true;
	String buttonText="Sign In";
	if (isDisplayed) {
		System.out.println("Button is displayed");
		if(buttonText.equals("Sign In")) {
			System.out.println("Test pass");
		}else {
			System.out.println("Wrong text is displayed");
		}
	}else {
		System.out.println("Beni ugrastirma");
	}
		
		
		
		}
}
