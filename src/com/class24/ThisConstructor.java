package com.class24;

public class ThisConstructor {
//we can execute 2 constructor when creating object
	ThisConstructor(){
		System.out.println("I am not argument constructor");
	}
	ThisConstructor(String str){
		this(); //used to call current class constructor. Always must be first statement
		System.out.println(str+ " I am a constructor with one parametre");
	}
	ThisConstructor(String str, String str1){
		this(str);
		System.out.println(str+" I am a constructor with two parametre "+str1);
	}
	public static void main(String[] args) {
		
		ThisConstructor obj=new ThisConstructor("Hello");
		ThisConstructor obj1=new ThisConstructor("Hello","Bye");
		
	}
}
