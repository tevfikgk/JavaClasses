package com.class6;

import java.util.Scanner;

public class SwitchCountryLanguage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your country?");
	String myCountry=scan.nextLine();
	
	switch (myCountry) {
	case ("Turkey"):
		System.out.println("Your language is Turkish");
	break;
	
	case ("US"):
		System.out.println("Your language is English");
	break;
	
	case ("Spanish"):
		System.out.println("Your language is Spanish");
	break;
	
	default:
		System.out.println("I dont know your language");
	}
	
	}
	

}
