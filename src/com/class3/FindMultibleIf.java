package com.class3;

import java.util.Scanner;

public class FindMultibleIf {
public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter small number");
	int smallNumber=scan.nextInt();
	
	System.out.println("Please enter large number");
	int largeNumber=scan.nextInt();
	
	if (largeNumber%smallNumber==0) {
		System.out.println(largeNumber+ " is multible of "+ smallNumber);
	} else
	{
		System.out.println(largeNumber+ " is not multible of "+ smallNumber);
	}
	
	
}
}
