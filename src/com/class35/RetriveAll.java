package com.class35;

import java.util.*;

public class RetriveAll {

	public static void main(String[] args) {

	Map<String,String>personMap=new LinkedHashMap<>();
	personMap.put("Name", "Ahmet");
	personMap.put("LastName", "At");
	personMap.put("Address", "123 Ah");
	personMap.put("City", "Dallas");
	personMap.put("State", "TX");
	
	System.out.println(personMap);
	//how to retrive a specific value?
	String value=personMap.get("State");
	System.out.println(value);
	
	//Retrive all keys and value
	Set <String> keys =personMap.keySet();
	for(String key:keys) {
		
		System.out.println(key+":"+personMap.get(key));
	}
	Iterator<String> keysIterator=keys.iterator();
	while(keysIterator.hasNext()) {
		System.out.println(keysIterator.next());
	}
	
	System.out.println("..........Printing all values");
	Collection<String> values=personMap.values();
	
	for(String val:values) {
		System.out.println(val);
	}
	Iterator<String> valuesIterator=values.iterator();
	while(valuesIterator.hasNext()) {
		System.out.println(valuesIterator.next());
	}
	
	//how can I retrive and print values key:value
	
	System.out.println("------Printing all the keys and values-----");
   
	Iterator<String> keysIterator1=keys.iterator();
	while (keysIterator1.hasNext()) {
		System.out.println(keysIterator1.next()+":"+personMap.get(keysIterator1));
	}
	
	Set<String> keeys=personMap.keySet();
    for(String key:keeys) {
        System.out.println(key+":"+personMap.get(key));
	}
}
}
