package com.class24;

public class Teacher {
	/*Write a Java program called Teacher.  Identify features and behaviour of that Class. 
	 * Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it thier own features and behaviour. Test all 4 classes */
	 
	String districtName= "Plano";
	String schoolName="Mc Millen";
	boolean teacherCertification=true;
	public static void main(String[] args) {
	Teacher math1=new Teacher ();
	System.out.println(math1.districtName);
	System.out.println(math1.schoolName);
	System.out.println(math1.teacherCertification);
	
	
	
	
	}
	
}
