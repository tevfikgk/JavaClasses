package com.class32;

public class Recap {
public static void main(String[] args) {
// to store single value	
	int num=10;
	// to store multiple value
	int [] array= {10,20,30};
	int arr[]=new int[3];
	arr[0]=100;
	arr[1]=200;
	arr[2]=300;
	System.out.println(arr[2]);
	
	for (int i=0; i<arr.length; i++) {  //for(int num:arr) {System.out.println(num);}
		System.out.println(arr[i]);
	}
	
	//we can store non primitive types:objects
	Fruit f=new Apple();
	Fruit f1=new Banana();
	Fruit f2=new Orange();
	Object monkey=new Monkey();
	Object[] mixArray= {f,f1,f2, monkey};
	for(Object fr:mixArray) {
	System.out.println(fr);	
	}
}
}	
	class Monkey extends Object{
		
	}
	class Fruit extends Object{
		
	}
	class Apple extends Fruit{	
	}
	class Banana extends Fruit{	
	}
	class Orange extends Fruit{	
	}
	
	

	
