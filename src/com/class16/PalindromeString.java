package com.class16;

public class PalindromeString {

	public static void main(String[] args) {

		String str1="kayak";
		String str2="";
		for (int i=str1.length()-1; i>=0; i--) {
			str2=str2+str1.charAt(i);
		}
		if (str2.equals(str1)) {	
		System.out.println("They are both same");
		} else
			System.out.println("They are not same");
	}

}
