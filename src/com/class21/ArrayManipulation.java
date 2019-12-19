package com.class21;

public class ArrayManipulation {

	
	protected int largestNumber(int []array) {
	int largest=array[0];
	for (int i:array) {
		if (i>largest) {
			largest=i;
		}
	}
	return largest;
	}
	public static int sumArray(int[] array) {
		int total=0;
	for (int element:array) {
		total+=element;
	}
	return total;
	}
	
	
	
	
	public static void main(String[] args) {
		
		int[]arr= {5,8,2,11,3,6,7,12};
		
		ArrayManipulation obj=new ArrayManipulation();
		System.out.println("The largest number in the arrey is: "+obj.largestNumber(arr));
		System.out.println("The sum of the numbers in the array: "+ArrayManipulation.sumArray(arr)); //**because static
		
	}
	
	
	
}
