package com.class8;

import java.util.Scanner;

public class Factoriel {
	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("How many number do you want to use?");
		int size= scan.nextInt();
		int [] array= new int [size];
		
		for( int i=0; i<=size-1; i++) {
			System.out.println("Enter a number");
			array[i]= scan.nextInt();
		}
		/*for(int i=size-1; i>=0; i--) {
			System.out.println(array[i]);
		}*/
		
		int a=0;
		for(int i=0; i<=size-1; i++) {
			if (i>a) {
				a=i;
			
			}
		}System.out.println(array[a]);
			
			
		
		
		}
		
		
	}
		
		
		
