package com.class7;

import java.util.Scanner;

public class WhileBooleanDayTime {

	public static void main(String[] args) {

		
		int day=1;
		boolean workday=true;
		while (workday) {
			System.out.println("I need a day off ");
			if (day==6) {
			workday=false;
			System.out.println("I do not need a day off any more");
			
			}	 
		day+=1;
		}	
			
		
		
	}

}
