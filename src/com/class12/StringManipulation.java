package com.class12;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//Number of element in string
			String str1="Syntax Technologies";
			int lengthOfStr1=str1.length();
			System.out.println(lengthOfStr1);
			
			String str2="Welcome, students!";
			int lengthOfString2=str2.length();
			System.out.println(lengthOfString2);
			
			//change to uppercase or Lowercase
			String str3="Hello";
			String newString3=str3.toUpperCase();
			System.out.println(newString3);
			
			String lowerCaseString=newString3.toLowerCase();	
			System.out.println(lowerCaseString);
			
			//equals compare 2 strings
			String str4="Hello";
			String str5="hello";
			boolean equality=str4.equals(str5);
			System.out.println(equality);
			
			
			//equals ignorecase 
			String expectedBrowser="Chrome";
			String actualBrowser="chrome";
			boolean equality1=expectedBrowser.equalsIgnoreCase(actualBrowser);
			System.out.println(equality1);
			
			String first="tevfik gok";
			String second="Tevfik Gok";
			boolean equal= first.equalsIgnoreCase(second);
			System.out.println(equal);
			
	}

}
