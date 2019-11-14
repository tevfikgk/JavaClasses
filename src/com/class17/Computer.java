package com.class17;

public class Computer {
	String brand, name, monitor, mouse;
	boolean keyboard;
	int size, memory, screen, ram ;
	
	void playGames() {  //method header
		System.out.println("I can play on my  "+name);
	}
	
	void javacoding() {
		System.out.println("I can do java coding on my "+name);
	}
	
	void watchMovie() {
		System.out.println("I can watch movie on my "+name);
	}
	
	public static void main(String[] args) {
	
		Computer comp1=new Computer();
		comp1.brand="Apple";
		comp1.name="MacBook Pro";
		comp1.memory=250;
		comp1.monitor="18inch";
		comp1.mouse="Bluetooth";
		comp1.size=20;
		comp1.screen=38;
		comp1.ram=250;
		System.out.println("I have "+comp1.brand+" "+comp1.name);
		comp1.javacoding();
		comp1.watchMovie();
		System.out.println("***********************");
		Computer compt2=new Computer();
		compt2.brand="Dell";
		compt2.name="420";
		
		compt2.javacoding();
		compt2.watchMovie();
		
		
		
	}
}
