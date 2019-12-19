package com.class33;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW2 {
	public static void main(String[] args) {
		
//Create an arraylist and remove the element which  last "e"
	List<String>list=new ArrayList<>(); 
	list.add("Cute");
	list.add("Love");
	list.add("Hello");
	list.add("Java");
	
	Iterator <String> it=list.iterator();
	while (it.hasNext()) {
		if(it.next().endsWith("e")) {
			it.remove();
		//break;
		}
	}
	System.out.println((list));
	}
}
