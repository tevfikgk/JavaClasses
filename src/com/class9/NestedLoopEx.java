package com.class9;

import java.util.Scanner;

public class NestedLoopEx {

	public static void main(String[] args) {

		for (int i=1; i<=5; i++) {
			for (int k=1; k<=i; k++) {
				System.out.print("*");
			}System.out.println("");
		}
		/*int i,j;
		for(i=0;i<=6;i++){
		for(j=1;j<=7-i;j++) System.out.print("*");
		System.out.println("");
	
		 Scanner inp = new Scanner(System.in);
		    System.out.print("Int:");
		    int end = inp.nextInt();
		    int endLast= 2*end;
		    for (end=0; end<endLast; end++){
		      System.out.print(end);
		    }    
	
		}*/
	}

}
