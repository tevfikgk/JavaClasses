package com.class34;

import java.util.*;

public class IteratorUsage {

	public static void main(String[] args) {

		List<String> stringList=new ArrayList<>();
		stringList.add("Esra");
		stringList.add("Hasan");
		stringList.add("Ak");
		stringList.add("Hasan");
		stringList.add("san");
		stringList.add("asan");
		stringList.add("Veli");
		//remove names that are shorter that 4 charecter
		stringList.remove(2);
		System.out.println(stringList);
		
		
		for(int i=0; i<stringList.size(); i++) { //stringList.size her remove dan sonra degistigi icin saglikli sonuc vermeyebilir. 
			if (stringList.get(i).length()<4) {
				stringList.remove(i);
			}
		}
		System.out.println(stringList);
		
		List<String> stringList1=new ArrayList<>();
		stringList.add("Esra");
		stringList.add("Hasan");
		stringList.add("Ak");
		stringList.add("Hasan");
		stringList.add("san");
		stringList.add("asan");
		stringList.add("Veli");
		//remove names that are shorter that 4 charecter
		stringList.remove(2);
		System.out.println(stringList);
		
		Iterator<String> it= stringList1.iterator(); //bu yontem daha saglikli
		while(it.hasNext()) {
			if (it.next().length()<4){
				it.remove();
			}
			System.out.println(stringList1);			
		}
	}

}
