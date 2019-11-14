package com.class6;

import java.util.Scanner;

public class ReplyIt48 {

	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);	
	//System.out.println("Gender");
	String gender;
	gender= scan.nextLine();
	//System.out.println("age");
	int age;
	age=scan.nextInt();
	String output=null;
	if (age>25) {
		
		if (gender.equals("M")) {
			output="Man";	
		} else if (gender.equals("F")){
			output="Woman";
		}
			
	} else if (age<=25){
		if (gender.equals("M")) {
			output="Boy";
			
		} else if (gender.equals("M")){
			output="Girl";
		}
		
	}
		System.out.println(output);	
		
	}

}
