package com.class8;

public class forLoopwithWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (double i=1; i<=5; i++) {
			if (i==3) {
			continue;
			
			}System.out.println(i);
		}System.out.println("I skip to number 3");
		
		
		for (int i=1; i<=50; i++) {
			if(i%3==0) {
				continue;
				
			}System.out.println(i);
		}
	} 

}
