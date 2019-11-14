package com.class4850;

import java.util.Scanner;

public class IfConditionGradeCalculation {

	public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter your first quize grade");
	int firstQuizeGrade=scan.nextInt();
	
	System.out.println("Enter your second quize grade");
	int secondQuizeGrade=scan.nextInt();
	
	System.out.println("Enter your third quize grade");
	int thirdQuizeGrade=scan.nextInt();
	
	int averageScore=(firstQuizeGrade+secondQuizeGrade+thirdQuizeGrade)/3;
	
	if (averageScore>=90) {
		System.out.println("Your grade is A");
	}  else if (averageScore>=80 || averageScore<90) {
		System.out.println("Your grade is B");
	}  else if (averageScore>=70 || averageScore<80) {
		System.out.println("Your grade is C");
	}  else {
		System.out.println("Your grade is not good");
	}
	
	}

}
