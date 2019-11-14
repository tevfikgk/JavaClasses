package com.class18;

public class Triangle {

	//Write a program to print the area and parameter of a triangle having sides of 3, 4
	//and 5 units by creating a class named 'Triangle' without any parameter in its constructor.
	
	void parameter(int a,int b,int c) {
		int parameter=a+b+c;
		System.out.println("Parameter of the triangle is "+ parameter);
		}
	void area(int a,int b,int c) {
		int area=a*b*c;
		System.out.println("Area of the triangle is "+ area);
	
		
	}
	public static void main(String[] args) {
		Triangle total=new Triangle();
		total.parameter(2, 3, 4);
		total.area(3, 5, 8);
		
	}
	
	
}
