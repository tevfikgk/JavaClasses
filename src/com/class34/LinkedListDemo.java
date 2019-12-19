package com.class34;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
	LinkedList<String> llist=new LinkedList<>();
	llist.add("Hello");
	llist.add("Bye");
	llist.add("Hello");
	llist.add("Bye");
	llist.add(2,"How are you");
	System.out.println(llist);
	//replace
	llist.set(1, "Good bye");
	//retrive
	System.out.println(llist.get(2));
	
	//retrive all elements
	for (int i=0; i<llist.size(); i++) {
		System.out.println(llist.get(i));
	}
	for (String el:llist) {
		System.out.println(el);
	}
	Iterator<String> it=llist.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());
	}
	
	
	
	
	}

}
