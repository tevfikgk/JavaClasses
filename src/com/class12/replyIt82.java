package com.class12;

public class replyIt82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] b = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
	  int totalNumber=0;
		for (int row=0; row<b.length; row++){
		  for (int col=0; col<b[0].length; col++){
		    if (b[row][col]<0 && b[row][col]%2!=0 ){
		      totalNumber= totalNumber+1;
		    }
		  }
		}
		System.out.println(totalNumber);
		
		
		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
			int sum1=0;
			int sum2=0;
			int sum3=0;
			int sum4=0;
			for (int col=0; col<a[0].length; col++){
			
				  
			  sum1=sum1+a[0][col];
			  sum2=sum2+a[1][col];
			  sum3=sum3+a[2][col];
			  sum4=sum4+a[3][col];
			  
	 }
			System.out.println(sum1);
			System.out.println(sum2);
			System.out.println(sum3);
			System.out.println(sum4);
		
		
		
		
		/*int[][] a = {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}
			};
		boolean square=true;
		if (a.length==a[0].length) {
			System.out.println(square);
		}else {
			System.out.println(!square);
		}
		
		
		
		
		
		int largestNumber=0;
		for (int row=0; row<a.length; row++) {
			for (int col=0; col<a[0].length; col++) {
				if (a[row][col]>largestNumber) {
				largestNumber=a[row][col];	
				} 
			}
		}
		System.out.println(largestNumber);
		
		
		
		
		
		
		/*double[][] a = {
				{1.4,2.0,3.3,2},
				{4,1.5,6.1,1},
				{1.2,3.1,4,1.6}
			};
			
			for (int row=0; row<a.length; row++){
			  for (int col=0; col<a[0].length; col++) {
			  System.out.print(a [row][col]+ ", ");}
			  
		System.out.println();	
		} */
			
			/*int[][] a = {
					{5,2,3,7},
					{1,5,2,2},
					{1,2,3,4}
				};
				int sum=0;
				for (int col=0; col<a[2].length; col++){
				  sum=sum+a[2][col];
				  
				}System.out.print(sum);*/
	}

}
