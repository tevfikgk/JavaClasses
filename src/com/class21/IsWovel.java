package com.class21;

import java.util.Scanner;

public class IsWovel {

	boolean vowel(char character) {
		boolean result;
		if (character=='e'|| character=='a'|| character=='o'|| character=='u'|| character=='i') {
			result=true;
		}else {
			result=false;
		}
		return result;
	}
	
	public static void main(String[] args) {
		
	
		IsWovel str=new IsWovel();
		boolean result1=str.vowel('e');
		System.out.println("the vowel is "+result1);
		if(result1) {
			int counter=0;
			Scanner scan=new 	Scanner(System.in);
			System.out.println("Enter a string");
			String str1=scan.nextLine();
			for(int i=0; i<str1.length();i++) {
				if(str1.charAt(i)=='e') {
					counter++;
				}
			}
			System.out.println("number of e is "+counter);
		}
	}
	
	
	
	
}
