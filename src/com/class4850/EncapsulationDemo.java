package com.class4850;

public class EncapsulationDemo{
	  private String empName;
	  private int empAge;
	  
	  public void setEmpName(String empName){
	   this.empName=empName;
	  }
	  public void setEmpAge(int empAge){
	  this.empAge=empAge; 
	  }
	  public String getEmpName(){
	  return empName;
	  }
	  public int getEmpAge(){
	  return empAge;
	  }
	}
class Main2 {

public static void main(String[] args) {
EncapsulationDemo obj=new EncapsulationDemo();
obj.getEmpName();
obj.getEmpAge();
obj.setEmpName("John");
obj.setEmpAge(30);
String a=obj.getEmpName();
System.out.println("Employee Name: "+a);
}
}
