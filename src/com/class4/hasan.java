package com.class4;
import java.util.Scanner;
public class hasan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 
				Scanner scan=new Scanner(System.in);
				System.out.print("Enter the first number: ");
				int num1=scan.nextInt();
				
				System.out.print("Enter the operator:");
				String operator=scan.next();
				
				System.out.print("Enter the second number: ");
				int num2=scan.nextInt();			

				
				if (operator.equals("+")) {
					System.out.println(num1+num2);
				}
				
				else if (operator.equals("-")) {
					System.out.println(num1-num2);
				}
				
				else if (operator.equals("/")) {
					System.out.println(num1/num2);
				}
				
				else if (operator.equals("*")) {
					System.out.println(num1/num2);
				}
				
				else {
					System.out.println("Invalid operator or number");
				}
				
					
				
		
		
	}

}
