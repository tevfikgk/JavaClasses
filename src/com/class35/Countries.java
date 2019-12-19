package com.class35;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Countries {
public static void main(String[] args) {

	HashMap<String,String> countries=new HashMap<>();
	countries.put("USA", "Washington");
	countries.put("UK", "London");
	countries.put("Turkey", "Ankara");
	countries.put("Spain", "Madris");
	countries.put("Russia", "Moskow");
	
	Set <String> abc =countries.keySet();
	Iterator<String> keysIterator=abc.iterator();
	while(keysIterator.hasNext()) {
		System.out.println(keysIterator.next());
	}	
	Collection<String> xyz=countries.values();	
	Iterator<String> valuesIterator=xyz.iterator();
		while(valuesIterator.hasNext()) {
			System.out.println(valuesIterator.next());
		}

	Iterator<String> countriesIterator=abc.iterator();
		while (countriesIterator.hasNext()) {
			System.out.println(countriesIterator.next()+":"+countries.get(countriesIterator));
			
			//*************something wrong "null"
		}
}
}

