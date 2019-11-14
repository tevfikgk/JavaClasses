package com.class18;

public class MathOperations {

		/*void add(int number1,int number2,int number3) {
			int sum=number1+number2+number3;
			System.out.println("The sum is " + sum);
		}*/
		void substract(int number1, int number2) {
			int result=number1-number2;
			System.out.println("The substract result is "+result);
		}
		void multiply (double number1, double number2) {
			double result1=number1*number2;
			System.out.println("The multiply result is "+result1);
		}
		int add(int number1,int number2,int number3) {
			int sum=number1+number2+number3;
			//System.out.println("The sum is " + sum);
			return sum; //**********************
			
	
			
			
}
		int multiply2(double num1, double num2) {
			//int result=(int)(num1*num2); duoble convert to int
			double result=num1*num2;
			int resultInt=(int) result;
			return resultInt;
		}
		
		String dummy(int num) {
			return "hahahah";
		}
}