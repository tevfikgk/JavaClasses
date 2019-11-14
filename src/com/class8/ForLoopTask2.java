package com.class8;

public class ForLoopTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int sumOfOdd=0;
	int sumOfEven=0;
	int a=1;

	for (a=1; a<=20; a++) {
		if (a%2==0) {
			sumOfEven=sumOfEven+a;
			
		}else if (a%2==1) {
			sumOfOdd=sumOfOdd+a;	
		} 
	}
	System.out.println(sumOfEven);
	System.out.println(sumOfOdd);

	}
}
