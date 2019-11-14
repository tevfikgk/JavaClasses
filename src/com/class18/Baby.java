package com.class18;

public class Baby {

		int weight;
		char gender;
		String firstName;
		String lastName;
		String hairColor;
		
		void talk(int times){
			for (int i=0; i<times; i++)
			System.out.println("Bla bla bla");
		}
		void walk() {
			System.out.println("Crawl");
		}
		void cry() {
			System.out.println("Cry every minute");
		}
		void displayBabyInfo(){
			System.out.println("Full name is; " +firstName+ " last name is "+lastName);
			if (gender=='F') {
				System.out.println("gender is girl");
			} else {
				System.out.println("gender is boy");
			}
		}
}
