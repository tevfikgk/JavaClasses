package com.class31;

public class ParentTest {

	public static void main(String[] args) {
		Parent p=new Child();
		p.hello();// static oldugu icin parent class basiyor. Sadece sub class static olsa bile. Static olunca subclass i sakliyor.
	}

}
