package com.class30;

public class VehicleTest {

	public static void main(String[] args) {

		BMW bmw= new BMW ("767ghfhfd", "Sedan","BMW","X5");
		//come from vehicle class
		bmw.drive();
		bmw.stop();
		bmw.speed();
		bmw.stop();
		//comes from car class
		bmw.breaking();
		//comes from its class
		bmw.display();
		
		Car bmw= new BMW ("767ghfhfd", "Sedan","BMW","X5");
		//come from vehicle class
		bmw.drive();
		bmw.stop();
		bmw.speed();
		bmw.stop();
		//comes from car class
		bmw.breaking();
		//comes from its class
		//bmw.display(); not read
		
		Vehicle  bmw= new BMW ("767ghfhfd", "Sedan","BMW","X5");
		//come from vehicle class
		bmw.drive();
		bmw.stop();
		bmw.speed();
		bmw.stop();
		//comes from car class
		// bmw.breaking(); not read
		//comes from its class
		//bmw.display(); not read
		
	
		
		
	}

}
