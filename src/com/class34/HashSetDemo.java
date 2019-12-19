package com.class34;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// Lets creat collection of vegies where i dont want duplicate
		
		HashSet<String> hset= new HashSet<>();
		hset.add("cucumber");
		hset.add("onion");
		hset.add("peper");
		hset.add("zuccini");
		hset.add("carrot");
		hset.add("zuccini");
		System.out.println(hset.size()); //zuccini yi cikardi
		System.out.println(hset);
		
		//they dont have any method to retrive elements from collection
		//.get(); , set();
		//how can ve retrive elements?
		Iterator<String> it=hset.iterator();
		while(it.hasNext()) {
			String element=it.next();
			System.out.println(element);
			
			//enhanced for loop
			for (String et:hset) {
				System.out.println(et);
			}
		}
	}

}
