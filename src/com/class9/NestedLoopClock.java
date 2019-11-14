package com.class9;

public class NestedLoopClock {

	public static void main(String[] args) {

		for (int h=0; h<24; h++) {
			for (int m=0; m<6; m++) {
			for (int s=0; s<=9; s++)
				System.out.println(h+":"+m+s);
			
			}
		}

	
		
		for (int h=0; h<24; h++) {
			for (int m=0; m<60; m++) {
			if(m<10) {
				System.out.println(h+":0"+m);
	
			} else {
				System.out.println(h+":"+m);
			}
			}
	
	}

			
	}
			
		
		
		
		
		
		
		
		
		
		
		
}
}