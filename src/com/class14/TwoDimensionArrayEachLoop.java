package com.class14;

public class TwoDimensionArrayEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] array = {{2,3,4}, {4,5,6}, {6,7,8}};
		
		for(int row=0; row<array.length; row++) {
			for (int col=0; col<array[row].length; col++) {
				System.out.print(array[row][col]+" ");
			}System.out.println();
		}
		
		//using advanced for loop
		for (int[] row:array) {
			for(int number:row) {
				System.out.print(number+" ");
			}System.out.println();
		}
		System.out.println("welcome to java".indexOf('w'));
		
	}

}
