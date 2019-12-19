package com.class19;

public class Allmethods {

	int sum(int num1, int num2) {
		int result=num1+num2;
		return result;
	}
	
	int sub(int num1, int num2) {
	int sub=num1-num2;
	return sub;
	}
	
	int div (int num1, int num2) {
		int div=num1/num2;
		return div;
	}
	
	int mult(int num1, int num2) {
		int mult=num1*num2;
		return mult;
	}
		
	boolean isOdd(int num) {
		boolean isOdd;
		if (num%2!=0) {
			isOdd=true;
		}else {
			isOdd=false;
		}
		return isOdd;
	}
	
	//method will take a week day number and return/
	String weekDayName(int weekDay) {
		String weekDayName=null;
		switch (weekDay) {
		case 1:
			weekDayName="Monday";
		break;
		case 2:
			weekDayName="Tuesday";
		break;
		case 3:
			weekDayName="Wednesday";
		break;
		}
		return weekDayName;
	}
	
	public static void main(String[] args) {
		
		Allmethods object=new Allmethods ();
		
	int addNumber=object.sub(5, 10);
	System.out.println(addNumber);
	int subNumber=object.sub(40, 19);
	System.out.println(subNumber);
	boolean oddNumber=object.isOdd(11);
	System.out.println(oddNumber);
	
	String day=object.weekDayName(2);
	System.out.println(day);
	}
	
	
	
}
