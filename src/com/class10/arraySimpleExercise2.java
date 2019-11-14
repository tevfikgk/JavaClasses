package com.class10;

public class arraySimpleExercise2 {

	public static void main(String[] args) {

		
		String[]animals= {"Cat", "Dog", "Cow","Snake", "Elephant"};
		
		int size= animals.length;
		
		for(int i=0; i<size; i++)
			System.out.print(animals[i]+ " ");
		System.out.println();
		
		int[] stores= {45,78,12,67,55,89,23,77,88};
		int i=stores.length;
		for (int k=0; k<i; k+=3){
		System.out.println(stores[k]);
		  
		  
		}
}
}
