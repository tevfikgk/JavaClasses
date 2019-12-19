package com.class32;

public class WrapperClasses {

	public static void main(String[] args) {

		int num=10;
		//Autoboxing--> converting primitive type into an OBject type
		Integer integer=100;
		 System.out.println(integer.MIN_VALUE); // result =-2147483648
		 String str=integer.toString();
		 System.out.println(str);
		
		Boolean bool=true;
		Byte $b=20;
		System.out.println($b.MAX_VALUE);
		
		//Autounboxing--> converting OBject type to a primitive type
	
		int num1=new Integer(10);
	System.out.println(num1);
	}

}
