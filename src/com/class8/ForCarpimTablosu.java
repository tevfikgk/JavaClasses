package com.class8;

import java.util.Scanner;

public class ForCarpimTablosu {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number from 1 to 10");
		int num;
		num=scan.nextInt();
		
		for (int i=1; i<=10; i++) {
			
			int num1=num*i;
			System.out.println(num +"*" + i + "="+num1);
		}
	}

}
