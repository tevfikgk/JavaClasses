package com.class38;

public class SpecificToGeneric {

	public static void main(String[] args) {

		int num1=12;
		int num2=0;
			int result = 0;
			try {
			result=num1/num2;
			System.out.println(result);
			Thread.sleep(4000);
			}
			
			catch(ArithmeticException e) {
				System.out.println("Dont use 'o' as second number");
				//e.printStackTrace();       (where, name, message0          ///************************************************
				//System.out.println(e);     (name, message)
				System.out.println(e.getMessage()); //(message)
			}catch(InterruptedException e) {
				System.out.println("someone interrupted program sleep");
				
			}catch(Exception e) {          //if you put it top compile give errors because the others catch can not readable. must be from spesific to generic
			System.out.println("catching all type of exception"); //because it is parent class
			
			}
	}			

}
