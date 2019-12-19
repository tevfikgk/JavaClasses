package com.class36;

import java.util.*;

public class Repl211 {

	public static void main(String[] args) {
		List<Map<String, Object>> dataList=new ArrayList<>();
		
		Map<String, Object> appleMap=new TreeMap<>();
		
		appleMap.put("Items", "Apple");
		appleMap.put("Price", "20.00");
		appleMap.put("Quantity", 10);
		dataList.add(appleMap);
		
		Map<String, Object> orrangeMap=new TreeMap<>();
		
		orrangeMap.put("Items", "Orrange");
		orrangeMap.put("Price", "21.99");
		orrangeMap.put("Quantity", 10);
		
		dataList.add(orrangeMap);
		System.out.println(dataList);
		
		
		for(Map<String,Object> kl:dataList) {
		Set<String> tg=kl.keySet();
			System.out.println(tt);
			
		}
	
		
	
	
	}
}
