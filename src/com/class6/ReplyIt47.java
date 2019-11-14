package com.class6;

import java.util.Scanner;

public class ReplyIt47 {

	public static void main(String[] args) {
	
	/*	If the weather is sunny you want to check the temperature. 
If the temperature is higher than 85 then "I am going to the beach"
otherwise, "I am going to the park"*/
		
		Scanner scan=new Scanner(System.in);	
		System.out.println("Is this weather sunny?");
		boolean isSunny=scan.nextBoolean();
		
		
		 
		 if (isSunny) {
			 System.out.println("It is a sunny day, I should go somewhere!");
			 System.out.println("Please enter the temperature");
		     int temperature=scan.nextInt();
		     if (temperature>85) {
		    	 System.out.println("I am goimg to the beach");
		     }else {
		    	 System.out.println("I am going to park");
		     }
		 }else {
			System.out.println("I stay home and practice Java"); 
		 }
		 
		 
		 
	}

}
