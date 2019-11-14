package com.class5;

import java.util.Scanner;

public class LogicalandScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* ask user to enter age
		 * from 1 to 3----you are baby
		 * 3-5 you are a toddler
		 * 5-12 kid
		 * 12-19 teenager
		 * 20> adult
		 */
		
		Scanner age= new Scanner(System.in);
		System.out.println("Please Enter Your age");
		int ageClass= age.nextInt();
		
		if (ageClass>=1 && ageClass<3) {
			System.out.println("You are a baby");
		}else if (ageClass>=3 && ageClass<5) {
			System.out.println("You are a toddler");
		} else if (ageClass>=5 && ageClass<12) {
			System.out.println("You are a kid");
		}else if  (ageClass>=12 && ageClass<=19) {
			System.out.println("You are a teenager");
		}else if (!(ageClass <20)) {
			System.out.println("You are an adult");
		}
		
	}

}
