package com.class27;

public class ClassStudent {
	void exam() {
		System.out.println("Students attends final exam");
	}
	void exam1() {
		System.out.println("Students attends final-1 exam");
	}
}

class SyntaxStudent extends ClassStudent{
	void exam() {
		System.out.println("Students attends java exam");
	}
	void quiz() {
		System.out.println("Students attends selenium exam");
	}	
}

class CollegeStudent extends ClassStudent {
	void exam() {
	System.out.println("Students attends bio exam");
	}
	void verbalTest() {
		System.out.println("Students attends verbal exam");
	}
}

class SchoolStudent extends ClassStudent{
	void exam() {
		System.out.println("Students attends math exam");
	}
	void gym() {
		System.out.println("Students attends gyh exam");
	}
}
