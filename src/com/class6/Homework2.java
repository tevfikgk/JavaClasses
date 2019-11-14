package com.class6;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
	System.out.println("Please insert the quiz note");
	double quiz=scan.nextDouble();
	System.out.println("Please insert the midTerm note");
	double midTerm=scan.nextDouble();
	System.out.println("Please insert the finalScore note");
	double finalScore=scan.nextDouble();
	
	double averageScore=(quiz+midTerm+finalScore)/3;
	String yourGrade=null;
	if (averageScore>=90) {
		yourGrade="Grade A";
		} else if(averageScore<90 && averageScore>=70) {
			yourGrade= "Grade B";
		} else if(averageScore<70 && averageScore>=50) {
			yourGrade= "Grade C";
		} else if(averageScore<50) {
			yourGrade="Grade F";
		}
			
	System.out.println("Your grade is " + yourGrade);	
	}

}
