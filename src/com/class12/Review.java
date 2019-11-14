package com.class12;

import java.util.Scanner;

public class Review {
public static void main(String[] args) {
	
	String str="Hello ";
	
	System.out.println(str.length()); 
	System.out.println(str.toLowerCase());
	System.out.println(str.toUpperCase());
	
	/* or String str1= str.toLowerCase();
	//or str=str.toLowerCase;
	System.out.println(str1);*/
	
	
	System.out.println(str.equals("Hello"));
	System.out.println(str.equalsIgnoreCase("hello"));
	
	/*boolean result=str.equals("Hello");
	System.out.println(str.equals("hello"));*/
	
	System.out.println(str.contains("ll"));
	//boolean.........
	
	System.out.println(str.startsWith("H"));
	System.out.println(str.startsWith("ll" , 2));    //******** 3ncu karakterden baslayarak test ediyor sonuc true
	// boolean result= str.startsWith("H");
	
	System.out.println(str.endsWith("ll"));
	
	System.out.println(str.isEmpty());
	
	String str3= str + " " + "word";
	str3=str.concat(" ").concat("Word");//******************************
	System.out.println(str3);
	
	String str4= str3.trim().concat("bodies");
	System.out.println(str4);
	
	//char result=str.charAt(1);
	System.out.println(str.charAt(1));
	
	System.out.println(str.indexOf("Hello")); //string
	System.out.println(str.indexOf("H"));   //char
			

	

	
	
	
	
}
}
