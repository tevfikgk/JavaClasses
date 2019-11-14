package com.class6;
import java.util.Scanner; 

public class ReplyIt35 {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Do you need a loan?");
		boolean loan = scan.nextBoolean();
		String eligibilty = null;
		
		if(loan) {
			System.out.println("What is your credit score?");
			int score = scan.nextInt();
			
			if(score < 600) {
				eligibilty = "Not eligible";
			}else if(score >= 600 && score <= 700) {
				eligibilty = "Maybe eligible";
			}else if(score >= 701 && score <= 800) {
				eligibilty = "Eligible";
			}else if(score > 800) {
				eligibilty = "Definitely eligible";
			}
		}else {
			eligibilty = "Unknown";
		}
		System.out.println("The eligibility is " + eligibilty);
		
	}
		 	} 
		 	
