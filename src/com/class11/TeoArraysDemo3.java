package com.class11;

public class TeoArraysDemo3 {

	
	public static void main(String[] args) {
		
	int [][] numbers= {
			{2,5,6,8},
			{1,3,5,4},
			{10,11,14,16}
			
	};
	
	int sum=0;
	for (int i=0; i<numbers.length; i++) {
		for (int j=0; j<numbers[0].length; j++) {
		sum=sum+numbers[i][j];	
		}
		}System.out.println(sum);
		System.out.println();
	
	int sum1=0;
	 for (int nums[]:numbers){
		 for (int getNum:nums) {
			 sum1=sum1+getNum;
			 
		 }
	 }System.out.print(sum1);
	 
	System.out.println();
	
	for (int i=0; i<numbers.length; i++) {
		for (int j=0; j<numbers[0].length; j++) {
		if (numbers[i][j]%2==0) {
			
			System.out.print(numbers[i][j]+ " ");}
		}
		System.out.println();
	}	
		
	}
}
