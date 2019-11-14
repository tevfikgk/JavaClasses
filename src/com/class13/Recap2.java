package com.class13;

public class Recap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1="Hello";
		String str2="Hello";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);
		
		
		
		String str3=new String("Bye"); //true
		String str4=new String("Bye");//false ////******while false? because it compares the two strings (Because of the "new String "
		
		System.out.println(str3.equals(str4));//true
		System.out.println(str3==str4);//false
	}

}
