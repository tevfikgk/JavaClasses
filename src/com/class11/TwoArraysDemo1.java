package com.class11;

public class TwoArraysDemo1 {

	public static void main(String[] args) {
		

		String [][] names= {
				{"Kaan","Yusuf","Alex","Zynab"},
				{"Mohammad", "Ann", "Nasylhan","Wegas"},
				{"Diego", "Ann","Zubair","Shogofa"}
		};
	
	int lengthOfRows=names.length;
	System.out.println(lengthOfRows);
	int lengthOfCols=names[1].length;
	System.out.println(lengthOfCols);
	
	for (String getArrays[]: names) {
		for (String  getName: getArrays) {
			System.out.print(getName+ " ");
			
		}
	
	System.out.println();
	
	}
	}

}
