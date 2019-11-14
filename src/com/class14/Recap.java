package com.class14;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String str=new String("Hello");
			String str3=new String("Hello");
			System.out.println(str==str3); //*****false because it doesnt compare values it compares variable. So they are different
			
			/*String str=new String("Hello");
			str3=str;
			System.out.println(str==str3); //******result true
			 * (This is only way to equal them)
			 */
			
			
			
			String s1="Hello";
			String s2="Hello";
			System.out.println(s1==s2);//**********true
			
			
			System.out.println(str);
			String str2=str.replaceAll("Hello", "Bye");
			System.out.println(str2);
			
			
	}

}
