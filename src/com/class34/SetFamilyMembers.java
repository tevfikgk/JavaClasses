package com.class34;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetFamilyMembers {

	public static void main(String[] args) {
		//create a collection that wont allow duplicate and preserve the order
	Set<String> fruitSet=new LinkedHashSet<>();
	fruitSet.add("Apple");
	fruitSet.add("Banana");
	fruitSet.add("Banana");
	fruitSet.add("Kivi");
	
	System.out.println(fruitSet.size());
	System.out.println(fruitSet);
	
	Set<Integer> tSet=new TreeSet<>();

	tSet.add(200);
	tSet.add(2000);
	tSet.add(200);
	tSet.add(99);
	tSet.add(0);
	tSet.add(99);
	System.out.println(tSet.size()); //dont allow duplicate, and put sequence
	System.out.println(tSet);
	
	//Adding collection into a collection
	
	List<String> list= new ArrayList<>();
	list.add("Jave");
	list.add("Selenium");
	
	Set<String> linkedSet=new LinkedHashSet<>();
	linkedSet.addAll(fruitSet); //add another collection /*************************
	linkedSet.addAll(list);
	System.out.println(linkedSet);
	}

}
