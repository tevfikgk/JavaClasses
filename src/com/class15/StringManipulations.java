package com.class15;

public class StringManipulations {

	public static void main(String[] args) {

	String str="Hello";
	String str1=new String("hello");
	int length=str.length();
	System.out.println(length);
	
	System.out.println(str.toLowerCase());
	System.out.println(str.toUpperCase());
	
	String myStrings="";  //String myStrings=null; doesnt mean that it is empty
	boolean isEmpty=myStrings.isEmpty();
	System.out.println(isEmpty);
	
	String a="Good evening students";
	System.out.println(a.contains("students"));
	
	System.out.println(a.startsWith("Good"));
	System.out.println(a.endsWith("student")); //false
	}

}
