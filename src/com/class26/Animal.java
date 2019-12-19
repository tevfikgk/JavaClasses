package com.class26;

public class Animal {

		public void sleep() {
			System.out.println("animal Sleep");
			
		}
		public void eat () {
			System.out.println("Animal eat");
		}
	
	
}
class Cat extends Animal{
	public void sleep() {
		System.out.println("Cat sleep");
	}
	public void meow() {
		System.out.println("I meow when i am hungry");
	}
	}

