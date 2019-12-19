package com.class27;

//define a class card with 2 methods and this class shpuld have 4 subclassses 
 //in which same behavior can be overriden and some can im   it is own behaviour
 // kk

	public class Card {
	public void chargeInterest() {
		System.out.println("Card charge 25% intereset");
	}
	
	public void creditLimit() {
		System.out.println("Credit limit of the card is 5000");
		}
}

class AX extends Card{
	public void creditLimit() { //overriding method
		System.out.println("Credit limit of the card is 25000");
		}
}
class MC extends Card{
	public void creditLimit() { //overriding method
		System.out.println("Credit limit of the card is 15000");
		}
	public void cashBack() {
		System.out.println("MC gives cash back of %3");
	}
}
class Visa extends Card{
	public void creditLimit() { //overriding method
		System.out.println("Credit limit of the card is 20000");
		}
}
class Discovery extends Card{
	public void applePlay() { //overriding method
		System.out.println("Discovery can take apple pay");
		}
}
