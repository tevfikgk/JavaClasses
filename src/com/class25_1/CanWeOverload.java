package com.class25_1;

public class CanWeOverload {
//Can we overload a private method? YES
	
	private void methodOne() {
		System.out.println();
	}
	private void methodOne(String str) {
		System.out.println();
	}
//Can we overload a main method? YES BUT EXECUTED ONLY LINE 21 BECAUSE JAVA ONLY RECOGNIZE THIS SIGNATURE. BUT WE CAN EXECUTE USING DIFFERENT WAYS. SEE LINE 23 AND 25
//Can we overload a static method? YES	
	
	public static void main(String args) {
		System.out.println("2");
	}
	public static void main(String str, String[] arg) {
		System.out.println("3");
	}
	public static void main(String[] args) {
		System.out.println("1");
		main("String"); //******************************ancak boyle yazarsak line 15 execute eder. Ya da CanWeOverload.main("String")
		String[]array= {"A","B"};
        main("Hello",array);//******************************ancak boyle yazarsak line 15 execute eder. Ya da CanWeOverload.main(.....)
	
	}
	}
