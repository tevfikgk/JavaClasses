package com.class25;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("Creating an object for a Employee-->");	
	Employee emp=new Employee();
	emp.salary=7000;
	Employee.companyName="SYNTAX";
	emp.work();
	emp.getPaid();
	
	System.out.println("Creating an object a Scrum Master Class-->");
	ScrumTeam sm=new ScrumTeam();
	sm.salary=90000;	
	sm.work();
	sm.getPaid();
	sm.artifacts="Product Backlog, Spring Backlog, Burndown chart";
	sm.ceremonies="Spring Demo, Spring Planning, Retro, Daily Scrum Meeting";
	sm.attendScrumMeetings();
	System.out.println("Creating an object a Scrum Class-->");
	Developer dev=new Developer();
	dev.salary=130000;
	dev.work();
	dev.getPaid();
	dev.code();
	dev.artifacts="Spring Backlog";
	dev.ceremonies="Spring Demo, Spring Planning, Retro, Daily Scrum Meeting";
	dev.attendScrumMeetings();
	}

}
