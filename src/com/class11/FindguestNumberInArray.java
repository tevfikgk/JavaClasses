package com.class11;

import java.util.Scanner;

public class FindguestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		int [][] box=new int[][] {
			{1,3,5,7,9},
			{2,4,6,8,10},
			{5,10,15,20,25}
		};
		
		System.out.println("enter a number");
		int guestNumber=scan.nextInt();
		
		for (int row=0; row<box.length; row++) {
			for(int col=0; col<box[1].length; col++) {
				if (guestNumber==box[row][col])
					System.out.println("your number is " + (row+1) +" row and "+ (col+1) );
				
			}
		}
	}

}
