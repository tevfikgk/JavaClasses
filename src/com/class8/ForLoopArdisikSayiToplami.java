package com.class8;

public class ForLoopArdisikSayiToplami {

	public static void main(String[] args) {

		int sum=0;
		for(int i=1; i<=5; i++) {
			sum=sum+i;
			System.out.print(sum+"+");
			
		} System.out.println();
		System.out.println(sum);
		
		int sumAll=0;
		for (int i=0; i<=20; i+=5) {
		sumAll=sumAll+i;	
		}System.out.println(sumAll);
		
		int total=2;
		for(int i=1; i<=3; i++) {
			total=total*i;
		}System.out.println(total);
	}

}
