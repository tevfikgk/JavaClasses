package com.class23;

public class BetterCar {

	public static String make;
	public String model;
	public String color;
	public int speed;
	public int doors;
	
	
	BetterCar(String carModel, String carColor, int carSpeed, int carDoor){
		model=carModel;
		color=carColor;
		speed=carSpeed;
		doors=carDoor;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	make="BMW";
	BetterCar bcar1=new BetterCar("X5","Blue",400,2);
	bcar1.getDetails();
	}

		public void getDetails() { //Bu da Class BetterCar icinde sadece asagiya yazldi. Yani farketmedigini gostermek icin
			System.out.println("I built "+color+ " "+ make+ " "+model+" speed "+speed+" door "+ doors);
		}
}
