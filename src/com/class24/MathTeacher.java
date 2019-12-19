package com.class24;

public class MathTeacher extends Teacher{

	String name;
	String mathCertificate;
	
	public void math () {
		System.out.println("i can give lesson geo and algebra");
	}
	public static void main(String[] args) {
		MathTeacher math1=new MathTeacher ();
		System.out.println(math1.districtName);
		System.out.println(math1.schoolName);
		System.out.println(math1.teacherCertification);
		math1.math();
		
		
		
		}
}
