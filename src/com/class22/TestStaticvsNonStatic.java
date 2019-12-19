package com.class22;

public class TestStaticvsNonStatic {

	public static void main(String[] args) {

		/* how to access static members
		 * they can be accessed by classname
		 */
	System.out.println(StaticVsNonStatic.school);
	StaticVsNonStatic.getInfo1();
	
		//how can we access non static members
	StaticVsNonStatic obj=new StaticVsNonStatic();
	obj.name="John";
	System.out.println(obj.name);
	obj.getInfo();
	}

}
