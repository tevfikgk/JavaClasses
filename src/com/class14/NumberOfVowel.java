package com.class14;

import java.util.Scanner;

public class NumberOfVowel {

	public static void main(String[] args) {

	Scanner scan=new Scanner (System.in);
	System.out.println("Enter a word");
	String userWord=scan.nextLine();
	int vowel=0;
	for (int i=0; i<userWord.length(); i++) {
		if (userWord.toLowerCase().charAt(i)=='a' || userWord.charAt(i)=='i' || userWord.charAt(i)=='e' ||userWord.charAt(i)=='u'||userWord.charAt(i)=='o') {
		vowel++;
		} 	
	}
	System.out.println("Number of the vowel is "+ vowel);
	}

}
