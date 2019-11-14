package com.class4;

import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {

Scanner name=new Scanner(System.in);
System.out.println("Enter your name");
String name1=name.nextLine();

Scanner number=new Scanner(System.in);
System.out.println("Enter your mobile number");
int number1=number.nextInt();

Scanner age=new Scanner(System.in);
System.out.println("Enter your age");
int age1=age.nextInt();

System.out.println("Your name is "+ name1 +" your age is "+ age1 +" and your mobile number is "+ number1);
	}
}
