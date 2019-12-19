package com.class11;

public class ArrayAverageValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] box=new int[][] {
			{1,3,5,7,9},
			{2,4,6,8,10},
			{5,10,15,20,25}
		};
		float average=0;
		for (int row=0; row<box.length; row++) {
			for(int col=0; col<box[row].length; col++){
			average= average+box[row][col];
			System.out.print(box[row][col]+" ");
			}System.out.println("");
		}
		System.out.println(average/(box.length*box[1].length));
	}

}
