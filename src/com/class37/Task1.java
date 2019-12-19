package com.class37;

import java.util.*;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String[] city= {"Istanbul","Irvine","Venice","Tokyo","Niamey","Paris"};
			Map<String, Integer> cityMap=new TreeMap<>();
			
			for (String s:city) {
				cityMap.put(s, s.length());
			
			}
			System.out.println(cityMap);
			
			Set<Entry<String, Integer>> cities=cityMap.entrySet();
			Iterator<Entry<String,Integer>> itr=cities.iterator();
			while(itr.hasNext()){
			Entry<String,Integer> e=itr.next();
			Integer length=e.getValue();
			String name=e.getKey();
			System.out.println(length+" "+name);
			if(length>7) {                             
				itr.remove();
			}
			
			}
			System.out.println(cities);
			
	}

}
