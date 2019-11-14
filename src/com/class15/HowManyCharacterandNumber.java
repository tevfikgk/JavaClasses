package com.class15;

public class HowManyCharacterandNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a Java program to count the letters, spaces, numbers and other characters of an input string.
		
		String info= "I was born in Kayseri in 1973.";
		String letter=info.replaceAll("[^a-zA-Z]", "");
		System.out.println("There are "+letter.length()+" letters in the sentence");
		String number=info.replaceAll("[^0-9]", "");
		System.out.println("There are "+number.length()+" numbers in the sentence");
		
	}

}
