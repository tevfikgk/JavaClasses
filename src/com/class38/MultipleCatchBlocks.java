package com.class38;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		division(12,2);
		division(12,0);
	}

	public static void division(int num1, int num2) {
			int result = 0;
			try {
			result=num1/num2;
			System.out.println(result);
			Thread.sleep(4000);
			}catch(ArithmeticException e) {
				System.out.println("Dont use 'o' as second number");
			}catch(InterruptedException e) {
				System.out.println("someone interrupted program sleep");
				
			}catch(Exception e) {
				System.out.println("catching all type of exception"); //because it is parent class
			}
	}			
			
	

}
