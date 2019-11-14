package com.class13;

public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="How are you today";
		System.out.println(str.replace(" ", "")); //bosluklari aliyor
		System.out.println(str.replace("\\s", ""));// ?????????
		
		
		
		System.out.println(str.toLowerCase().replace("how", "Low")); //***
		System.out.println(str.replaceAll("powerful(.*)", ""));
		
		
}
}