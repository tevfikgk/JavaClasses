package com.class8;

public class ForLoop {
public static void main(String[] args) {
	
	for (int a=5; a<22; a++){
	    if (a%2==1){
	    System.out.println(a);
	      
	    }
	    }
	   
	    
	    
		 
	
	
	for(int i=1; i<=4; i++ ) {
		System.out.println("Good morning");
	}
	
	for(int i=10; i>=1; i--) {
		System.out.println(i);
	}
	
	//we can use same variable "i" because this variable live only in for loop. outside the loop it is not existed.
	for (int p=0; p<=50; p+=5) {
		System.out.print(" "+ p + " ");
	}
}
}
