package com.class24;

public class TestforInherince {

	public static void main(String[] args) {
		Child1 child1=new Child1();
		System.out.println(Child1.race);//altough static it comes*****
		System.out.println(child1.hairColor);
		System.out.println(child1.eyeColor);
		child1.sing();
		child1.code();
		
		Parent parent=new Parent();
		System.out.println(parent.hairColor);
		System.out.println(Parent.race);
		System.out.println(parent.eyeColor);
		parent.sing();
	}

}
