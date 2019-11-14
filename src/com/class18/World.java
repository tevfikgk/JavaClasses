package com.class18;

public class World {

	public static void main(String[] args) {
    Baby baby1=new Baby();
    baby1.firstName="John";
    baby1.lastName="Doe";
    baby1.gender='M';
    baby1.hairColor="brown";
    baby1.weight=7;
    baby1.talk(5); //****************
    baby1.cry();
    baby1.walk();
    System.out.println(baby1.firstName);
    System.out.println(baby1.lastName);
    baby1.displayBabyInfo(); //**
    Baby baby2=new Baby();
    baby2.cry();
    baby2.lastName="Smith";
    
	}

}
