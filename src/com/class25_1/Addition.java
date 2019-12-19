package com.class25_1;

public class Addition {
//method overloading (overloading methods and constructors)
	//1 by  passing different amount of parametres
	public void add(int num1,int num2) { //"add(int num1,int num2)" bu bolume method signature diyor' Method overloading olmasi icin sadece bu bolumun farkli olmasi gerekir.
		System.out.println(num1+num2);   // public void .... yada public int.... olsa da sadece burayi degistimek yetmez.Hata verir. in other words
	}									// return type degistirmekle overloading yapamayi
	public void add(int num1,int num2,int num3) {
		System.out.println(num1+num2+num3);
		}
	//2 by passing different type of parametres
	
	public void add(int num1, double num2) {	
	System.out.println();
	}
	public void add(double num1, int num2) {	
	System.out.println();
	}
	public void add(double num1, double num2) {
	System.out.println();	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition obj=new Addition();
			obj.add(12, 15);
			obj.add(1,2,3);
			obj.add(12.09, 1.3);
			obj.add(1.5, 2);
			String str="Hello";
			str.substring(1, 3);             //********************************
			System.out.println(str.substring(1, 3));
		}
	}



