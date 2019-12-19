package com.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<String>strList=new ArrayList<>();
		strList.add("Ali");
		strList.add("Veli");
		strList.add("Maria");
		strList.add("Yalani");
		strList.add("Dolaniyla");
		//retrive valurs from an arrayList
		for(int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		for(String name:strList) {
		System.out.println(name);	
		}
		//3 way -using Iterator
		Iterator<String> it =strList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
	}

}
