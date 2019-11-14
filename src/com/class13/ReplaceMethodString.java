package com.class13;

public class ReplaceMethodString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Hallo Daar, how ara you";
		
		System.out.println(str.replace('e', 'z'));
		System.out.println(str.replace("Daar", "Respected"));
		
		
		String str1="Ali Ali gel";
		System.out.println(str1.replaceFirst("Ali", "Veli"));
		System.out.println(str1.replaceAll("Ali", "Veli"));
	}

}
