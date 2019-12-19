package com.class29;

public abstract class Phone {  //if there is an abstract/undefined method class must be abstract ****************
	public void makeCall() {
		System.out.println("Make call");
	}
	public void sendText() {
		System.out.println("Send text");
	}
	//unimplemented method
	public abstract void takePictures(); //**************************
	public abstract void playGames(); 
}
	// concrete class
class iPhone extends Phone{

	@Override                                 /////////////////line 17-24 iphone hata verdiginde uzerine tiklayinca otomatik olarak alindi
	public void takePictures() { 
		System.out.println("Iphone take pictures");
	}

	@Override
	public void playGames() {
		System.out.println("Play games on Iphone");
	}
	
}
class Samsung extends Phone{

	@Override
	public void takePictures() {
		System.out.println("Samsung take pictures");	
	}

	@Override
	public void playGames() {
		System.out.println(" Play games on Samsung");
	}
	
}
