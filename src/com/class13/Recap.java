package com.class13;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1="Hello";
		String str2="HelLO";
		System.out.println(str1.isEmpty());
		System.out.println(str2.length());
		System.out.println(str1.indexOf('H'));
		
		String a="asdfrghmntredkgvjgfqa rrrr eeeee";
		System.out.println(a.indexOf('a', 9));  //****** After index of 9 look for"a"
		
		System.out.println(str1.charAt(0));
		
		
		int []c= {12,13,14,15};   //***** important
		System.out.println(c.length);
		
		System.out.println(str2.toUpperCase());
		System.out.println(str2); //****** str2 is still as the beginning."HelLo" 
		
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println(str2.contains("Hel"));
		
		System.out.println(str1.startsWith("H"));
		System.out.println(str1.endsWith("o"));
		
		
	
		
	}

}
