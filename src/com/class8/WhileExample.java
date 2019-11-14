package com.class8;

import java.util.Scanner;

public class WhileExample {
public static void main(String[] args) {
	
	Scanner scan;
	
	boolean rain;
	scan=new Scanner(System.in);
	do {
		System.out.println("Is it raining?");
		rain=scan.nextBoolean();
		}
	while(!rain);
		System.out.println("Lets go to the park");
		
}
}
