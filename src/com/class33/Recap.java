package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {

	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(10);
		numbers.add(100);
		numbers.add(1000);
		
		int size=numbers.size(); //4
				System.out.println(size);
				
		//add more
				numbers.add(10000);
		//remove
			numbers.remove(size-1);
				System.out.println(size-1); //4-1
			numbers.remove(1);
			System.out.println(numbers); // [1,10,1000,10000]
		//retrive value from an arraylist
		int element=numbers.get(0);
		System.out.println(element);
		for (int i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		//advanced loop
		}for (int num:numbers) {
				System.out.println(num);
			}
		Iterator<Integer>iterator=numbers.iterator();
		while (iterator.hasNext()) {
			int number=iterator.next();   //autoboxing
			if (number%2!=0) {
			System.out.println(iterator.next());
		}
		}
		}
	}

