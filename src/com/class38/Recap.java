package com.class38;

public class Recap {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//runtime exception
		int[] num= {12,13};
		try {
		System.out.println(num[2]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("trying to accesss element outside of the boundary");
		}
		
		
		//compile time-checked
		Thread.sleep(1000); ///look line 5 ends
		System.out.println("end of code");
		
	}

}
