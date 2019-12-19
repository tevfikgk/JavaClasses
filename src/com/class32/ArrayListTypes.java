package com.class32;

import java.util.ArrayList;

public class ArrayListTypes {

	public static void main(String[] args) {
		//Generic Array list
	ArrayList<String>strList=new ArrayList<>();
	strList.add("Ali");
	strList.add("Veli");
	strList.add("Maria");
	strList.add("Yalani");
	strList.add("Dolaniyla");
	//strList.add(10); not possibe
	
	if (!strList.isEmpty()) {
		for (int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		System.out.println(strList.size());
	}
	System.out.println("IS empty ? "+strList.isEmpty());
	System.out.println("Is contains Ahmet? "+strList.contains("Ahmet"));
	//ArrayList can Generic and non-Generic
	//Non generic
	ArrayList alist=new ArrayList();
	alist.add("abc");
	alist.add(15);
	alist.add(12.234);
	alist.add(true);
	alist.add('c');
	System.out.println(alist );
}

}
