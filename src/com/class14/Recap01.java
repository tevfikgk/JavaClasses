package com.class14;

public class Recap01 {
public static void main(String[] args) {
	
	String s="this is index of examples";//there are 2 's' characters in this sentence  
	int index1=s.lastIndexOf('s',1);//returns last index of 's' char value  
	System.out.println(index1);//6  
	
	String s1="javatpoint is a very good website";  
	String replaceString=s1.replaceAll("a","e");//replaces all occurrences of "a" to "e"
	//String replaceString=s1.replace('a','e'); //You can not put in the replaceAll a char
	System.out.println(replaceString); 

		String s2="My name is Khan. My name is Bob. My name is Sonoo.";  
		String replace=s2.replaceAll("\\s","");  //remove empties.
		System.out.println(replace); 
		
		String s3="java string split method by javatpoint";  
		String[] words=s.split("\\s");//splits the string based on whitespace  
		//using java foreach loop to print elements of string array  
		for(String i:words){  
		System.out.println(i);  
		}  
}
}
