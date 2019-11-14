package com.class15;

import java.util.Arrays;

public class MaxMinNumberArray {

	public static void main(String[] args) {

		int [] array= {100,-90,8787,898,0,1};
		
		Arrays.sort(array); ///kucukten buyuge dizdi.
		
		int min=array[0];
		int max=array[array.length-1];
		System.out.println(min);
		System.out.println(max);
		
		//2 way
		int [] myArray= {100,-90,8787,898,0,1};
		int largest=myArray[0];
		int smallest=myArray[0];
		
		for (int i=0; i<myArray.length; i++) {
			if (myArray[i]>largest) {
				largest=myArray[i];
			} else if (myArray[i]<smallest) {
				smallest=myArray[i];
			}
			
		}
		System.out.println("The smallest= " +smallest);
		System.out.println("The largest= "+ largest);
	}

}
