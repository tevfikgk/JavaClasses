package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class Homework {

	public static void main(String[] args) {
	
		ArrayList<String>car=new ArrayList<>(); //List<String>car=new ArrayList<>(); de olabilir.
		car.add("Nissan");
		car.add("Toyota");
		car.add("Honda");
		car.add("BMW");
		
		for(String cars:car) {
			System.out.println(cars);
		}
		for (int i=0; i<car.size(); i++) {
			System.out.println(car.get(i));
		}
		Iterator<String> it=car.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
	}
	
}
