package com.class14;

public class Example {

	public static void main(String[] args) {

	String a="I am very willing to learn Java. and to be a tester";
	
	String array[]= a.split(" ");
	for (int i=0; i<array.length; i++) {
		System.out.println(array[i]);
		
	}
	System.out.println("");
	
	
	String b="I am very willing to learn Java(!?//).I wil do in 100 days! And to be a tester";
	String array2= b.replaceAll("[a-zA-Z]", "");
	System.out.println(array2);
	System.out.println(array2.replaceAll(" ", ""));
	
	System.out.println("");
	
     String c="Is it Saturday? Is it raining? Do we have java class today?";
     String [] array3=c.split("\\?");
     System.out.println(array3.length);
	
	}

}
