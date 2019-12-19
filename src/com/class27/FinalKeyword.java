package com.class27;

public class FinalKeyword {
	public final String str="Hello"; // ayri class icinde oldugu icin line 7 yi etkilemiyor.
	
	public static void main(String[] args) {
	String str="I am awesome";
	str="I am cool";
	System.out.println(str);

	
	final String finalString="Java is easy";
	//finalString="aaaaa"; compile arror.
	System.out.println(finalString);
	
	
}
}
