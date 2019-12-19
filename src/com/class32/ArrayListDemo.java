package com.class32;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

	ArrayList <String>arrayList=new ArrayList<>();
	//to store values inside collection
	arrayList.add("John");
	arrayList.add("Jane");
	arrayList.add("Jack");
	
	//to retrieve the value from arraylist
	System.out.println(arrayList.get(1));
	
	//add more values
	arrayList.add("James"); //you can add as many as you want. Daha onceki array dan en onemli farki bu. sinirlama yok.//*********
	arrayList.add("Jane"); // you can dublicate
	// remove values
	arrayList.remove("John"); 
	
	//how many element inside arrayList
	System.out.println(arrayList.size()); //5
	
	ArrayList<Integer>numArrList=new ArrayList<>();
	numArrList.add(100);
	numArrList.add(200);
	numArrList.add((300+200)/2); // you can make some operations
	//updateValue
	numArrList.set(0, 1000); //index 0 -->1000
	System.out.println(numArrList);
	
	System.out.println(numArrList.get(1));
	
	for (int i=0; i<numArrList.size(); i++) {
		System.out.println(numArrList.get(i));
	for (Integer number:numArrList) {
		System.out.println(number);
		
	}
	}
	
	}

}
