package com.class19;

import java.util.Scanner;

public class CreateEMail {

	void str (String name, String lastName, String eMail){
		System.out.println("Your proposal mail address is: " +name+lastName+"@"+eMail);
		}
	int primeNumber (int number) {
	int count=0;
		for (int i=2; i<number; i++) {
			if (number%i==0){
			count++;
			}
		}
	if (count==0) {
		System.out.println("Number is prime number");
	}else {
		System.out.println("number is not prime number");
	}
		return number;
	}
	
	char userGrade (int x) {
		char grade;
		if (x>=90) {
		grade='A';
		} else if(x>=80 && x<90) {
		grade='B';
		} else if(x>=70 && x<80) {
		grade='C';
		} else {
		grade='F';
		}
		return grade;
	}
	
	public static void main(String[] args) {
		CreateEMail object=new CreateEMail ();
		object.str("jan", "yz", "gmail");
		object.primeNumber(968);
		char k=object.userGrade(95);
		System.out.println(k);
		
	}
}
