package com.class14;

public class Recap5 {
public static void main(String[] args) {
	
	String str="I Am very happy today, Because i earn  today more money.";
	
	String a[]=str.split("today");
	System.out.println(a.length);
	
	for (int i=0; i<a.length; i++) {
		System.out.println(a[i]);
	}
	String [] b= str.split("[A-Z]");
	System.out.println(b.length);
	
	for (String i:b) {    //*********** tekrar gozden gecir
		System.out.println(b);
	}
	System.out.println("************");
	String longStr="I like number 3 and 4 because 7 ate 9";
	String [] stringArray= longStr.split("[0-9]");
	for (String str1: stringArray) {
		System.out.println(str1);
		
	}
}
}
