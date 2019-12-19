package com.class36;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import	java.util.TreeMap;

public class HW {

	public static void main(String[] args) {

			Map<Integer,String> map=new TreeMap<>();
			map.put(1234,"Mac Laptop1");
			map.put(1235,"Mac Laptop2");
			map.put(1236,"Mac Laptop3");
			map.put(1237,"Mac Laptop4");
			map.put(1237,"Mac Laptop5");
			System.out.println(map);
			
			//tp retrive key-values using entry set
			
			Set<Entry<Integer,String>> set=map.entrySet();                      //it can be used Map.Entry sometimes
			for (Entry<Integer,String> entry:set){
				System.out.println(entry.getKey()+" "+entry.getValue()); //System.out.println(entry); works AS WELL
			}
	}

}
