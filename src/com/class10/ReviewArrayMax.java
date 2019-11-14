package com.class10;

import java.util.Scanner;

public class ReviewArrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Size of the person");
		
		int size=scan.nextInt();
		int[] array=new int[size];
		
		for (int i=0; i<size; i++) {
			System.out.println("enter a number");
			array[i]= scan.nextInt();
		}
			for (int i=0; i<size; i++) {
		
		System.out.println(array[i]);
	}

}
}