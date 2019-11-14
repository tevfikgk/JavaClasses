package com.class13;

public class RegularExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		
		
		//print only text and not numbers
		
		String str="14234556ytirkvmvmbg   5959595";
		System.out.println(str.replaceAll("[0-9]", "")); //**************** sayilar haric basar
		System.out.println(str.replaceAll("[0-9]", "abc")); // sayilar yerine abc basar
		System.out.println(str.replaceAll("[a-zA-Z]", ""));//***************harfler haric basar
		
		//Remove everthing except text and numbers
		String str2="313134139m30o m0394094+++==";
		System.out.println(str2.replaceAll("[a-zA-Z0-9]",""));//********** "^" isareti "DO" NOT ANLAMINDA KULLANILIR. "!" GIBI 
		System.out.println(str2.replaceAll("^[a-zA-Z0-9]",""));
	
		String dob="12-22-1990";
		System.out.println(dob.replace("-", "/"));
	}
	
	

}
