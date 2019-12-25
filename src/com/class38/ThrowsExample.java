package com.class38;

public class ThrowsExample {

	
		static String name="John";
		
		
		public static void studentSleeping () throws InterruptedException  {    
			System.out.println("Student "+name+" sleeping");
			Thread.sleep(3000);
		}
		public static void callingStudentSleeping() throws InterruptedException {
			studentSleeping();
		}
		public static void callingMore() {
			try {
				callingStudentSleeping();
			} catch(InterruptedException e){
				System.out.println("InterruptedException");
			}
		}
		public static void main(String[] args) { //throws InterruptedException {// eger en son metodda exception a catch etmeseydi buraya "throws InterruptedException" yazacaktik
			callingMore();
		}

}
