package com.class37;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Task2 {
public static void main(String[] args) {
	Map<String, Integer> abc=new HashMap<>();
	abc.put("Ali", 10000);
	abc.put("Veli", 30000);
	abc.put("Cali", 20000);
	abc.put("Kali", 15000);
	
	System.out.println(abc);
	String nameS=null;
	int hSalary=0;
	Set<Entry<String, Integer>> klm=abc.entrySet();
	for(Entry<String, Integer> entE:klm) {
	int s=entE.getValue();
	if(s>hSalary) {
		hSalary=s;
		nameS=entE.getKey();
	}
	}
	
	System.out.println(nameS+" =$"+hSalary);
}
}
