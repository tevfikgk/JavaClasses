package com.class33;
import java.util.ArrayList;
import java.util.List;


class Instructor{
	String a,b;
	Instructor (String a, String b){
		this.a=a;
		this.b=b;
	}
	public void main() {
	System.out.println(a+" "+b);
	}
	
}

public class InstructorList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create a list that will hold 5 instructor
	List<Instructor> ilist=new ArrayList<>();
	Instructor obj=new Instructor("Ali","Veli");
	ilist.add(obj);
	ilist.add(new Instructor("Asel","Umurzakova"));	
	ilist.add(new Instructor("Diego","kova"));
	ilist.add(new Instructor("Ask","Umur"));	
	ilist.add(new Instructor("Ssel","Kurzakova"));
	ilist.add(new Instructor("LLl","Vacaa"));	
	
	for (Instructor i:ilist) {
		i.main();
	}
}
}
