package com.class6;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan= new Scanner(System.in);
	
	int quiz;
	int midTerm;
	int finalScore;
	int average;
	System.out.println("Please enter quiz score");
	quiz=scan.nextInt();
	
	System.out.println("Please enter midTerm score");
	midTerm=scan.nextInt();
	
	System.out.println("Please enter finalScore score");
	finalScore=scan.nextInt();
	
	average=(quiz+midTerm+finalScore)/3;
	
	if (average>90) {
		System.out.println("Your grade is A");
		} else if(average>=70 && average<90) {
			System.out.println("Your grade is B");
			}else if(average>=50 && average<70) {
				System.out.println("Your grade is C");
			}else if (average<50) {
				System.out.println("Your grade is D");
			}else {
				System.out.println("You work hard");
			}
			}
	
	}


