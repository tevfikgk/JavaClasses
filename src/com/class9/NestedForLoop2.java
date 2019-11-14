package com.class9;

public class NestedForLoop2 {

	public static void main(String[] args) {

	
		for (int row=1; row<=5; row++){
		      for (int col=5; col>=1; col--){
		        if (col>row){
		         System.out.print (" ");
		          }else 
		            System.out.print (row);
		          
		          
		      }System.out.println();
		    }
		    
		
		
		
	/*int sumOfOddNumber=0;
	int sumOfEvenNumber=0;
	for (int i=0; i<=100; i++) {
	
		if (i%2!=0) {
		sumOfOddNumber=sumOfOddNumber+i;
		} else 
		sumOfEvenNumber=sumOfEvenNumber+i;	
		
	}
	System.out.println("Total of the odd number= "+ sumOfOddNumber);
	System.out.println("Total of the even number= "+ sumOfEvenNumber);	
		
	/*int total=0;
	for (int i=1; i<=5; i++){
		total=total+i*i;
	}	System.out.println(total);*/
		
		
		
		
		
		
	/*int total=0;
		
	for (int i=1; i<=5; i++) {
		total=total+i;
	}
	int average=total/2;
	System.out.println(average);*/
}
	}
	



