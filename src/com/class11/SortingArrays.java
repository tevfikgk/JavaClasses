package com.class11;

import java.util.Arrays;

public class SortingArrays {

	public static void main(String[] args) {
		
		String[] actualNames= {"Jhon", "Smith","Alex","Tanaz"};
        Arrays.sort(actualNames);
        
        String[] expectedNames= { "Smith","Jhon","Alex","Tanaz"};
        
        //To sort the elements of an Array
        Arrays.sort(expectedNames);//EZBERLE
        
        System.out.println(Arrays.toString(actualNames));
        
        String actual=Arrays.toString(actualNames);
        String expected=Arrays.toString(expectedNames);
        
        System.out.println(actual.equals(expected));
		
        
		int[] numbers= {12,34,5,66,9};
	   Arrays.sort(numbers);//EZBERLE
	   for(int i:numbers) {
	   System.out.print(i+ " ");
	   }
	}
}
