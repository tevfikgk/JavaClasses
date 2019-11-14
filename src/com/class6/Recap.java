package com.class6;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
		int time=33;
	    String timeOfDay=null;
	    
	    if (time>=1 && time <=11) {
	    	timeOfDay="Morning";
	    } else if (time>=12 && time <=15) {
	    	timeOfDay="noon";
	    } else if (time>=16 && time<=20) {
	    	timeOfDay="Evening";
	    } else if (time>20 && time<=24) {
	    	timeOfDay="Night";
	    }else {
	    System.out.println("Your entry is invalid");
	    }
	    System.out.println(timeOfDay);
	    
	    if (timeOfDay.equals("Morning"))
	    System.out.println("Good Morning");
	    
	    }
	   
		
		
		
		
	}


