package com.class11;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String country[]= {"Turkey", "Irak", "Iran"};
		for(String i:country) {//************************************
			
			switch (i) {
			
			case "Turkey":
				System.out.println("Ankara");
				break;
			case "Irak":
				System.out.println("Bagdat");
				break;
			case "Iran":
				System.out.println("Tahran");
				break;
			}
			
		}
		
		
		
		int number[]= {1,2,3,4,5};
		int sum=0;
		
		for (int i:number) {
		sum=sum + i;
		
		}System.out.println(sum);
		
		
		
		/*int [] number= {2,3,5,7};
		
		for (int i = 0;  i<number.length; i++) {
			System.out.println(number[i]);
		}
		
		int [] array= {1,2,3,4,5};
		for(int ar:array) {
			System.out.println(ar);}*/
			
			
		String car[]= {"BMW", "AUDI", "TOYOTA", "HONDA", "HYUNDAI", "MAZDA"};
	
		for (int i=0; i<car.length; i++){
		System.out.println(car[i]);
		} 
		
		for (String i:car) {//***********************************************
			System.out.println(i);
		}
		
	}
	
	
	

}
