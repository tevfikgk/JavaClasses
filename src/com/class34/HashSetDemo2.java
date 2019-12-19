package com.class34;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo2 {
public static void main(String[] args) {
	// create collection  that will store sweets type of object 

	Set<Sweets> sweetSet=new HashSet<>();
	Sweets sweet=new Sweets("Cake");
	
	sweetSet.add(sweet);
	sweetSet.add(new Sweets("Cookies"));
	sweetSet.add(new Sweets("Ice Cream"));
	sweetSet.add(new Sweets("Baklava"));
	sweetSet.add(new Sweets("Chocolate"));
	sweetSet.add(sweet);
	
	System.out.println(sweetSet.size()); //5
	
	//how do we print name of each sweet
	
	for (Sweets element:sweetSet) {
		System.out.println(element.name);//daha onceki LinkListDemo dan geldi.
	}

}

}
