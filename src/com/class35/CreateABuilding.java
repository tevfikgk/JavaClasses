package com.class35;

import java.util.HashMap;

public class CreateABuilding {

	public static void main(String[] args) {

	HashMap<Integer,String> map=new HashMap<>();
	map.put(1,"Google");
	map.put(2,"Apple");
	map.put(3,"Syntax");
	map.put(4,"Microsoft");
	map.put(5,"Samsung");
	map.put(5,"Apple");
	map.put(7,"amazon");
	
	int size=map.size();
	
	map.replace(4, "Oracle");
	
	map.remove(7);
	System.out.println(map);
	}

}
