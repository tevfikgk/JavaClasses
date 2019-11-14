package com.class14;

public class Recap03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
int [] array= {12,32,45,85,78,96};

		int max=0;

		int secondLargest = 0;

		for (int i = 0; i < array.length; i++) {

		    if (array[i] > max) {

		        secondLargest = max;
		        max = array[i];
		    } else if (array[i] > secondLargest) {
		         secondLargest = array[i];
		    }}
		 System.out.println(max);
         System.out.println(secondLargest);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Write a java program to find the second largest number in the array?
		//Maximum and minimum number in the array?		

				/*int[] a= {9,8,5,67,45,56,38};
				int max = a[0];
				int secondMax = a[0];
				int min=a[0];
				
				for(int i=0;i<a.length;i++) {
					if(a[i]>max) {
						max = a[i];
					}else if(min>a[i]){
						min =a[i];
					}else if (secondMax < max && a[i] > secondMax) {
						secondMax = a[i];	
					}
				}
				
				
				System.out.println(max);
				System.out.println(min);
				System.out.println(secondMax);*/
		
		
	}

}
