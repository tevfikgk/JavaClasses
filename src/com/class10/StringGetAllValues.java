package com.class10;

public class StringGetAllValues {

	public static void main(String[] args) {

		/*I want to print all values from an array
		when value is Dog, i say  i love dogs*/
	
String[]animals= {"Cat", "Dog", "Cow","Snake", "Elephant"};
		
		int size= animals.length;
		
		for(int i=0; i<size; i++) {
			if (animals[i].equals("Dog")){
				System.out.println("I low dogs");
				}else {
			
			System.out.println(animals[i]);
			}
		}
	}
}

