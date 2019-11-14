package com.class5;

public class IfAndOrString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 7 days a week
		 */
		/*
		 * if days is 2 or 4----SDLC Class
		 * if da 6 or 7----java class
		 */
		
		String weekDay="Tuesday";
		
		
		if(weekDay.equals("Tuesday") || weekDay.equals("Thursday")) {
			System.out.println("SDLC Class");
		} else if (weekDay.equals("Saturday") || weekDay.equals("Sunday")){
		System.out.println("Java Class");	
		} else if (weekDay.equals("Wednesday")) {
			System.out.println("Review Class");
		} else {
			System.out.println("No class");
		}
			
	
	
	}

}
