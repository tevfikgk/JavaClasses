package com.class14;

public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//split method convert from string to array
		String str="Hello Word. How are you today. Fine Thanks";
		String [] array=str.split(" ");// bosluktan boluyor. Boslukta gidiyor.
		for (int i=0; i<array.length-1; i++) {
			System.out.println(array[i]); 
		}
		
		String [] array2=str.split("\\."); //******* noktadan sonra bolmek icin \\ kullanmak zorundayiz. virgulde no problem
		for (int i=0; i<array2.length; i++) { //**********for (String string : array2)  String icin kisa yol  for (char i:array5) or (int i: array13)
		System.out.println(array2[i]);
		}
		String str2="Hello Ali. How are you today. Fine Thanks";
		String [] array3=str2.split("\\.");
				System.out.println(array3.length);
	}

}
