package com.class4;

public class NestedPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isFriday=true;
		int day=14;
		//if today is Friday only day I want to check if it day is 13
		
		if (isFriday) {
			System.out.println("Today is Friday");
			if(day==13) {
				System.out.println("I will watch scary movie");
			} else {
				System.out.println("I will watch comic video");
			}
		} else {
			System.out.println("Today is not Friday");
		}
		
	}

}
