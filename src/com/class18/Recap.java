package com.class18;

public class Recap {

	void sum (int num1, int num2) {
		int c=num1+num2;
		System.out.println("The sim of the 2 number is "+c);
	}
	void saySomething (String word, int times) {
		for (int i=0; i<times; i++) {
		System.out.println(word);	
		}
	}
	
	public static void main(String[] args) {
		Recap obj=new Recap();
		obj.sum(10, 30);
		
		obj.saySomething("hello", 4);
		
	}
		
	}


