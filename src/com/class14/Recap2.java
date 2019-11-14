package com.class14;

public class Recap2 {
	public static void main(String[] args) {
	
	//replace
		
		String str="Your Syntax Technologies";
		System.out.println(str.replace('y', 'i'));
		System.out.println(str.replace("Your", "My"));
		System.out.println(str); //******** str value didn't change remain as beginning
  
		String str2="Morning everyone. Groups, share your insights! "
				+ "how do you practice in groups? "
				+ "What do you do? Do you work on questions? do you do exercise? "
				+ "How long are your meetings? How often?:";
		System.out.println(str2.replaceAll("work(.*)", "" ));		//"Removed after work"
		
		
		String str3="2345Hell3049o";
		System.out.println(str3.replaceAll("[0-9]", "")); //bosluklari da alarak sayilari cikardi "Hello" basti
		System.out.println(str3.replaceAll("[A-z]",""));  //buyuk kucuk harfleri cikardi "[a-zA-Z]" olarak da yazilabilir
		System.out.println(str3.replaceAll("[^0-9]", "")); //bosluklari da alarak sayilari basti.
		
		System.out.println(str2.replaceFirst("Morning", "")); //sadece morning basmadi
	}
}     
