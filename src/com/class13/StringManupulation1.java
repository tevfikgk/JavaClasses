package com.class13;

public class StringManupulation1 {

	public static void main(String[] args) {

		
		String str1="Java is getting interesting";
		
		//substring
		System.out.println(str1.substring(5));
		System.out.println(str1.substring(1,5));
		
		
		
		String str2="Sunday";
		for (int i=str2.length()-1; i>=0; i-- ) {
			char str3=str2.charAt(i);
			System.out.print(str3);
		}
		
		System.out.println("");
		
		
		String a="number3number";
		int middle=a.length()/2;
		int b=a.length();
		if (!a.isEmpty()){
			if (b%2!=0 && b>3){
				System.out.println(a.charAt(middle));
				
			}
		}
		
				
	}

}
