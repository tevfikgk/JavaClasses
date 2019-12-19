package com.class27;

public class ClassStudentTest {
	public static void main(String[] args) {
	ClassStudent std= new SyntaxStudent();
	std.exam();
	std.exam1();
	
	ClassStudent std1= new CollegeStudent();
	std1.exam();
	std1.exam1();
	
	ClassStudent std2= new ClassStudent();
	std2.exam();
	std2.exam1();
	
	ClassStudent array[]= {new SyntaxStudent(), new CollegeStudent(),new ClassStudent()};
	for(ClassStudent myArray:array) {
		myArray.exam();
	}
	//for (int i=0; i<array.length; i++) {
	//	array[i].exam();
	//}
}
}
