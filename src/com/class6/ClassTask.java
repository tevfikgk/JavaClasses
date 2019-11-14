package com.class6;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {
		
   Scanner scan=new Scanner(System.in);
   System.out.println("Enter the month you were born please");
   
   String month=scan.nextLine();
	
   String season;
	if (month.equals("January") || month.equals("February") || month.equals("December")) {
	season="Winter";
	} else if (month.equals("March") || month.equals("April") || month.equals("May")) {
		season="Spring";
	} else if (month.equals("June") || month.equals("July") || month.equals("August")) {
		season="Summer";
	} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
		season="Autumn";
		
	}else {
		season="Unknown";
	}
	System.out.println("You were born in " + season);
	System.out.println(month);
		
}	
}
