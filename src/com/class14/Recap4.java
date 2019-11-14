package com.class14;

public class Recap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="I am very happy today/ Because i earn a lot of money";
		String str1=str.substring(10);
		System.out.println(str1);
		System.out.println(str.substring(10, 15));
		System.out.println(str.length());
		
		System.out.println("************************");
		// String empty="" but char can not be empty char a='' olmaz
		String str3=str.replace('a', 'w');
		System.out.println(str3);
		System.out.println(str.replace("very", "hot"));
		
		System.out.println(str.replaceAll("am", "are"));
		str.replaceAll("[aA]", "e"); //********************** lowe case and uppercase changing
		;
		System.out.println(str.replaceAll("[a-z, /,B]", "1")); //***************virgulle ayirip her seyi yazabilirsin. replaceAll is stronger then replace
	}

}
