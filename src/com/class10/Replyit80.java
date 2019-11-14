package com.class10;

import java.util.Scanner;

public class Replyit80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			Scanner scan=new Scanner(System.in);
			int[] inputs=new int [5];
			
			int k=inputs.length;
			
			System.out.println("Enter 5 number");
			inputs[0]=scan.nextInt();
			inputs[1]=scan.nextInt();
			inputs[2]=scan.nextInt();
			inputs[3]=scan.nextInt();
			inputs[4]=scan.nextInt();
			
			for (int l=0; l<k; l++) {
				System.out.println(inputs[l]);
			}	
			for (int i=0; i<k; i++){
			System.out.println(inputs[i]*10);
			}		
	}

}
