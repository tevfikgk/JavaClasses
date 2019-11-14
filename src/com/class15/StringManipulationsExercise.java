package com.class15;

public class StringManipulationsExercise {

	public static void main(String[] args) {

		String str="Syntax Technologies";
		char letter=str.charAt(5);
		System.out.println(letter);
		System.out.println(str.charAt(str.length()-1)); //************ once en icteki ve sagdaki
		
	
		System.out.println(str.substring(0, 6));
		
		String str1="Java Classe at Syntax are awesome";
		System.out.println(str);
		System.out.println(str1.replace("awesome", "great")); 
		System.out.println(str1.replace("git", "cold")); //hata basmaz. Sadece oldugu gibi basar
		
		//replaceAll --> specify regular expresion
		String a=str.replaceAll("[^A-Za-z0-9]", ""); //everything except ......
		System.out.println(a);
		
		String myString="Java classes at Syntax";
		String [] array=myString.split("a");
		System.out.println(array.length); /////******************** bolunen parcalar
		
		int k=10;
		int l=20;
		int c=k+l;
		int k1=c-k;
		int l1=c-l;
		System.out.println("new k= "+k1);
		System.out.println("new l= "+l1);
		String x="Hello";
		String y="Word";
		String z=x+y;
		String y1=z.substring(0, x.length());
		System.out.println("New X= "+y1);
		String x1=z.substring(x.length());
		System.out.println("New Y= "+x1);
		
	}

}
