package com.class16;

public class IQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="Hello 5694idjfn95 459fgv 594tr ";
		str=str.replaceAll("[^a-nA-N]", "");
		System.out.println(str);
		
		String str1="Today is very cold outside";
		String substring=str1.substring(0,5);
		
		String [] words=str1.split(" ");
		System.out.println(words.length);
		
		//reverse string
		
		String [] str2=str1.split("\\s");
		System.out.println(str2);
		for (int i=str2.length-1; i>=0; i--) {
			System.out.println(str2[i]);
		}	
		String given1="Today is Java Class";
		char [] array= given1.toCharArray();	
		for (int k=array.length-1; k>=0; k--) {
			System.out.print(array[k]);
		}
			//*with charAt reverse
		System.out.println();	
			for (int m=given1.length()-1; m>=0; m--) {
				System.out.print(given1.charAt(m));
			}
		
		}
		
	}


