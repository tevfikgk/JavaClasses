package com.class30;

public interface Drivable {
	//butun variable lar "public static final variables"
	boolean DRIVE_FAST=true;  //***Buyuk harfle yazilmasi bir kural. Public static final oldugunu vurgulamak icin
	
	
	// by default compiler will add public abstract to the methods
		void drive();
}		
class Cars{
	public void stop() {
		System.out.println("Car stops by pressing breaks");
}

}		
class Toyota extends Cars implements Drivable{

	@Override
	public void drive() {
		System.out.println("Toyota can drive");
	}
}

