package com.class31;
//Create an Interface ‘Shape’ with undefined methods as calculateArea and calculatePerimiter . 
//Create 2 child classes: Circle & Square that should have an implementation of area and perimeter calculation. Test your code.
public interface Shape {

	public void calculateArea(double i);
	void calculateArea();
	public void calculatePerimeter();
}

	class Circle implements Shape{	
	
	@Override
	public void calculateArea() {
	}
	@Override
	public void calculatePerimeter() {
	}
	double pi=3.142234;
	double c=0;
	public void calculateArea(double i) {
		c=i*pi;
		System.out.println(c);
	}
}
