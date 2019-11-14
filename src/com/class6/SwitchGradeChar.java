package com.class6;

import java.util.Scanner;

public class SwitchGradeChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter your grade");
	char grade= scan.next().charAt(0);
	String yourGrade;
	switch(grade) {
	
	case('A'):
		yourGrade="Excellent";
	break;
	case('B'):
		yourGrade="Good";
	break;
	case('C'):
		yourGrade="Average";
	break;
	case('D'):
		yourGrade="Bad";
	break;
	default:
		yourGrade="not acceptable";
	}
	System.out.println("Your grade is " + yourGrade);
}

}
