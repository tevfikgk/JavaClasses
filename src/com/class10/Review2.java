package com.class10;

public class Review2 {
	
	public static void main(String[] args) {
	
	//**   **
	//*******
	//*******
	//**   **
		
	for (int row=1; row<=4; row++) {
		for (int col=1; col<=7; col++)
		if (col==1 || col==2 || col==6 || col==7 || row==2 || row==3) {
			System.out.print("*");
		}else {
			System.out.print(" ");
		}
		System.out.println();
	}	
	
	//$$$$$
	//$   $
	//$   $
	//$$$$$

	for (int row=1; row<=4; row++) {
		
		for (int col=1; col<=5; col++) {
			if (row==1 ||col==1 || row==4 || col==5) {
				System.out.print("$");
			} else {
				System.out.print(" ");
			}
		} System.out.println();
		
	}
	
	}
}

