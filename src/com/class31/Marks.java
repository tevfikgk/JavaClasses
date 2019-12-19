package com.class31;

public abstract class Marks {
public abstract void getPercentage();
}
class A extends Marks{
int history;
int math;
int PE;
	public A(int history,int math,int PE) {
		this.history=history;
		this.math=math;
		this.PE=PE;
	}
	@Override
	public void getPercentage() {
		System.out.println("the percentage is  "+(history+math+PE)/3);
	}
}
class B extends Marks{
	int history;
	int math;
	int PE;
	int science;
		public B(int history,int math,int PE,int science) {
			this.history=history;
			this.math=math;
			this.PE=PE;
			this.science=science;
		}
	@Override
	public void getPercentage() {
		System.out.println("the percentage is  "+(history+math+PE+science)/3);
	}
}
