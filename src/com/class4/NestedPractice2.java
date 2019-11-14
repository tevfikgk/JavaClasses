package com.class4;

public class NestedPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean diploma=false;
		boolean degree=true;
		boolean degreeProgram=true;
		int gpaScore= 2;
		if (diploma) {
			System.out.println("congratuations");
		}else {
			System.out.println("i will suggest you to get a degree");
			if (degreeProgram) {
				if (gpaScore>=3.5) {
					System.out.println("You are eligible for scholarship");
				}else {
					System.out.println("You should studied harder");
				}
			}
		}
				
		
		
	}

}
