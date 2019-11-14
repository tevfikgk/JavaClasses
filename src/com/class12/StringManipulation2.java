package com.class12;

public class StringManipulation2 {

	public static void main(String[] args) {

			
		// contains
		String str="Good morning, students!";
		boolean contains=str.contains("d m");
		System.out.println(contains);
		
		
		String present= "Welcome, Asel";
		String neededValue="Welcome,";
		boolean flag =present.contains(neededValue);
		System.out.println(flag);
		
		String present1= "Welcome, Asel5467";
		String neededValue2="welcome,";
		boolean flag1 =present1.toLowerCase().contains(neededValue2);
		System.out.println(flag1);
		
		
		
		
		//start with... or end with......
		String str1="syntax";
		boolean starts= str1.startsWith("s");
		System.out.println(starts);
		
		System.out.println(str1.endsWith("X"));
		
		//String is empty or not
		
		String str2="Hello";
		boolean i = str2.isEmpty();
		System.out.println(i);
		
		String k="";
		System.out.println(k.isEmpty());
		
		// Concatination
		
		String i1="Hello ";
		String i2="Ali!";
		System.out.println(i1+i2);
		System.out.println(i1.concat(i2));
		
		// trim (like Clean space in front and back)
		
		String expected="You may qualify for a multi-policy discount";
		String actual=" You may qualify for a multi-policy discount ";
		
		System.out.println(expected.equals(actual));
		
		actual= actual.trim();
				System.out.println(expected.equals(actual));
		
		
		
		
		
		
		
				
				
				
				
				
				
				
				
				
				
				
		
	}

}
