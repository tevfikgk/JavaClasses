package com.class4;

public class NestedIfMore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  /* check age, if age is less than 16--- you are too young
   * if you are older than 18--- you can get driver licence
   * and if not you can get driver permit
   */
		
	int age=55;
	if(age<16) {
		System.out.println("You are too young to drive");
	} else {
		System.out.println("You are eligible to drive ");
		if(age>=18) {
			System.out.println("You can drive a lone");
			} else {
				System.out.println("You need your parents to drive");
		}
	}
	System.out.println("*****************************************");
	
	/* we need to check if student completed the quiz
	 * if yes---- good job, if not -----not good
	 * if they completed w will check score:
	 * if more than 90--- you got an A
	 * if more than 80--- you got a   B
	 * anything below--- you should study below
	 */
	
	boolean quiz=true;
	int score=89;
	if (quiz) {
		System.out.println("Good Job");
	} if (score>=90){
		System.out.println("You got an A");
	} else if(score>80) {
		System.out.println("You got an B");
	} 
	} else  {
		System.out.println("Not good");	
	}
}
}
