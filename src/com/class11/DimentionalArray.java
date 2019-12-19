package com.class11;

public class DimentionalArray {
public static void main(String[] args) {
	
	//Declare 2Array
	
	int [][]array=new int[3][4];
	
	int[][] numbers= {
			
			{8,7,5,3,8},
			{1,5,6,4,9},
			{3,6,8,0,9}
	};
	/*System.out.println(numbers [1][4]);
	//number of row length*/
	System.out.println(numbers.length);
	/*number of column length*/
	System.out.println(numbers[1].length);
	
	for (int i=0; i<numbers.length; i++) {
		for (int j=0; j<numbers[i].length; j++) {
			System.out.print(numbers[i][j]+" ");
		}
	System.out.println();
	}
}
}
