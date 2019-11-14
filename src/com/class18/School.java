package com.class18;

public class School {
	public static void main(String[] args) {
		Student student1=new Student();
		student1.studentNr=222;
		student1.studentName="Temel Laz";
		student1.graveLevel="Grade 1";
		
		Student student2=new Student();
		student2.studentName="Mary adams";
		student2.studentNr=333;
		student2.graveLevel="Grade3";
		
		Teacher teacher1=new Teacher();
		teacher1.teacherName="Paul Smith";
		teacher1.salary=2000;
		teacher1.subject="Math";
		
		Teacher teacher2=new Teacher();
		teacher2.teacherName="Ali Veli";
		teacher2.salary=3000;
		teacher2.subject="Bio";
		student1.study();
		teacher2.yell();
	}
}
