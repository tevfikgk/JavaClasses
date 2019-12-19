package com.class25_1;

public class ConstructorOverloading {

	//different amount of parametres and different type of parametres
	ConstructorOverloading(){
		System.out.println("I am non argument constructor");
	}
	ConstructorOverloading(String str){
		System.out.println("I am constructor with one string parametre");
	}
	ConstructorOverloading(int a){
		System.out.println("I am constructor with one parametre");
	}
	public static void main(String[] args) {

		ConstructorOverloading obj=new ConstructorOverloading("Ali");
		ConstructorOverloading obj1=new ConstructorOverloading(5);
	}

}
