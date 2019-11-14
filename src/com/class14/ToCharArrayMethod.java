package com.class14;

public class ToCharArrayMethod {

	public static void main(String[] args) {

		String str="Syntax";
		
		char[] array=str.toCharArray();
		
		for (char i:array) {
			System.out.print(i);
		}
		System.out.println();
		char b='w';
		char c='a';
		System.out.println(b+c);//****** 216 basar.Yani harflerin degeri
		
		char []z= {'a','b','c'};
		System.out.println(z); //*******abc basar
		
		String [] p= {"Hello","Word"};//[Ljava.lang.String;@15db9742 basar. Yani tanimsiz
		System.out.println(p);
		
		String v="merhaba";
		String f="Canset";
		System.out.println(v+f);//******"merhabaCanset
		
		
		
	}

}
