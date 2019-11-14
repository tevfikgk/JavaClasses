package com.class2;

public class PerimeterandArea {

	public static void main (String [] args) {
		
	int width=5;
	int height=8;
	
	int area=width*height;
	int perimeter= 2*(width+height);
	
	System.out.println("The perimeter of rectangle with width " +width+ " and height " + height+  " is equal to " +perimeter +" and area is " +area);
	
	String message="The perimeter of rectangle with width " +width+ " and height " + height+  " is equal to " +perimeter +" and area is " +area;
	System.out.println(message);
	}
	
}
