package com.class14;

public class SplitMethod2 {

	public static void main(String[] args) {

		//how to seperate comma delimated string.
		
		String str="Hello Word, How are you today, Fine Thanks";
		String [] a=str.split(",");
		
		for (int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
		// to seperate limited parts
		String str1="Welcome To Syntax Technologies";
		String [] a2= str1.split(" ", 2);
		for (int i=0; i<a2.length; i++) {
			System.out.println(a2[i]);
		}
		
	}

}
