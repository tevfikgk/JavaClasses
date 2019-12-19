package com.class34;

import java.util.*;

class Sweets{
	
	String name;
	Sweets (String name){
		this.name=name;
	}
	
	public void iLove() {
		System.out.println("I love "+name);
	}
}
public class LinkListDemo2 {

	public static void main(String[] args) {
		List<Sweets> sweetList =new LinkedList<>();
		sweetList.add(new Sweets("Cholcalate"));
		sweetList.add(new Sweets("Cake"));
		sweetList.add(new Sweets("Cokies"));
		sweetList.add(new Sweets("fruit"));

		for(Sweets element: sweetList) {
			System.out.println(element.name);
			element.iLove();
		}
		//retriving 1 element and accessing method (2 steps)
		Sweets mySweet=sweetList.get(2);
		mySweet.iLove();
		//retriving 1 element and accessing method (2 steps)
		sweetList.get(2).iLove();
		String nameOfTheSweet=sweetList.get(2).name;
		//System.out.println(nameOfTheSweet);
	}

}
