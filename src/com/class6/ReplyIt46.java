package com.class6;

import java.util.Scanner;

public class ReplyIt46 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in); 
	  System.out.println("Please enter a number");
	  int number = 0;
	  
	  if (number%2==0){
	    System.out.println("Value is even");
	    if (number>100){
	      System.out.println("Value is too large");
	    }else {
	      System.out.println("Value is just right");
	       }
	    }
	    else {
	      if (number<100){
	       System.out.println("Value is just right and is an odd number") ;
	      }else{
	        System.out.println("This is an odd number and value is too high");
	      }
	    }
	    
	}

}	 


