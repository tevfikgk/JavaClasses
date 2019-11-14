package com.class2;

public class VariableDeclaration {

	public  static void main (String [] arg) {
//1
	int num1=123;
	int num2= 12345;
	long num3=333445566L;
	char num4='A';
//2	
	int n1;
	n1=23;

//3
	int k1, k2, k3;
	k1=55;
	k2=66;
	k3=77;
//4
	
//System.out.println(n1);
// 
  n1=1345;
System.out.println(n1);

boolean var=true;
System.out.println(var);

char myVariable='*';
System.out.println(myVariable);

	num2=num1;
	System.out.println(num2);
	//number2=false; compiler time error asking to change date type of variable number2 to boolean
	
	boolean isRain=false;
	boolean isSnow;
	isSnow=isRain;// isSnow=false
	System.out.println(isSnow);
	
	isSnow=true;
	System.out.println(isSnow);
	
	
	
	}
}