package com.class35;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Recap {
public static void main(String[] args) {
	
	Set<Double> set=new LinkedHashSet<>();
	set.add(99.99);
	set.add(19.99);
	set.add(59.99);
	set.add(29.99);
	set.add(49.99);
	set.add(99.99);
	
	Iterator<Double> iterator=set.iterator();
	while(iterator.hasNext()) {
		double d=iterator.next();
		if(d<50) {
			iterator.remove();
		}
		System.out.println(d);
	}
	
	set.clear();
	System.out.println("i deleted all"+set);
	
	//How can access/update just one value from the set collection
	Set<String> lset=new LinkedHashSet<>(); 
	lset.add("Hello");
	lset.add("Noon");
	lset.add("evening");
	lset.add("Night");
	
	// Convert to array list and remove one data
	List<String> myList=new ArrayList<>();
	myList.addAll(lset);
	String element=myList.get(2);
	System.out.println(element);
}
}
