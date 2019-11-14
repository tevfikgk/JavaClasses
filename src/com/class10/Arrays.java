package com.class10;

public class Arrays {

	public static void main(String[] args) {

		int[] b; // or int b[];
		b=new int[4];
		
		// or int [] b=new int[4];
		
		b[0]=10;
		b[1]=20;
		b[2]=30;
		b[3]=40;
		System.out.println(b[2]);
		
		String[] classes=new String[4];
		classes [0]="java";
		classes [1]="SDLC";
		classes [2]="Manual Testing";
		classes [3]="GIT";
		System.out.println("Today we have " + classes[0]+ " class");
		
		int [] nums=new int[3];
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		//how can change 1 to 100
		nums[0]=100;
		System.out.println(nums[0]);
		
		String[] names=new String[3];
		names[0]="Diena";
		names[1]="Seda";
		names[2]="Jaime";
		
		
		int [] a=new int[4];
		a[0]=12;
		a[1]=13;
		a[2]=14;
		a[3]=15;
		
		System.out.println(a.length);
		
		char []grades=new char[6];
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		System.out.println(grades[1]);
	}

}
