package com.class3;

public class TaskIf {

	public static void main(String[] args) {
		/*
		 * Class schedule if tuesday-- sdlc if wednesday--- java review if thursday --
		 * sdlc if saturday--- java coding if sunday -- my favorite java coding
		 */
		int day =5;
		
		if (day==2) {
			System.out.println("SDLC Class");
		} else if (day==3) {
			System.out.println("Review Class");
		} else if (day==4) {
			System.out.println("SDLC Class");
		}else if (day==6) {
			System.out.println("java class");
		} else if (day==7){
			System.out.println("Favorite Java Class");
		} else {
			System.out.println("There is no any class at school");
		}
		int num2=10;
		num2=num2-5;
		System.out.println(num2);

	}

}
