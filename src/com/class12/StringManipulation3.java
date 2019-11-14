4package com.class12;

import java.util.Scanner;

public class StringManipulation3 {
	public static void main(String[] args) {
	
//return a character at specified index

		
		
	String str="Students";
	char character=str.charAt(2);
			System.out.println(character);
	
			for (int i=0; i<str.length(); i++) {
				System.out.print(str.charAt(i)+ ",");
			} System.out.println("");
			
	///return an index of specified character
			
			String str1="Sunday";
			int index=str1.indexOf("d");
			System.out.println(index);
			
	//
			String str2="Syntax Technologies";
			System.out.println(str2.indexOf("Syntax")); //0 because take only first char
			System.out.println(str2.indexOf("Technologies"));//7 because take only first char
			System.out.println(str2.indexOf(" "));//6
			System.out.println(str2.indexOf("w"));//-1
	
	}			
}