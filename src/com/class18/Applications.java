package com.class18;

public class Applications {

	public static void main(String[] args) {
		MathOperations mathOps=new MathOperations();
		mathOps.add(3, 5, 8);
		mathOps.substract(8, 6);
		mathOps.substract(1, 7);
		mathOps.multiply(3, 4.3);
		int sum=mathOps.add(3, 5, 8);
		System.out.println(sum);
		String a= mathOps.dummy(3);
		System.out.println(a);
	}

}
