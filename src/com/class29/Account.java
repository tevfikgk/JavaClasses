package com.class29;
class Person{
	 private String firstname;
	  private String lastname;
	  private int birthmonth;
	  private int birthday;
	  private int birthyear;
	  private String ssn;
	  
	 public Person(String firstname, String lastname, int birthmonth, int birthday, int birthyear, String ssn) {
			super();
			this.firstname = firstname;
			this.lastname = lastname;
			this.birthmonth = birthmonth;
			this.birthday = birthday;
			this.birthyear = birthyear;
			this.ssn = ssn;
	}
	  
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getBirthmonth() {
		return birthmonth;
	}
	public void setBirthmonth(int birthmonth) {
		this.birthmonth = birthmonth;
	}
	public int getBirthday() {
		return birthday;
	}
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	public int getBirthyear() {
		return birthyear;
	}
	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public String formatBirthday(int birthmonth, int birthday, int birthyear) {
	String dob=birthmonth+"/"+birthday+"/"+birthyear;
	return dob;
	}
	  
}
class Main{
	public static void main(String[] args) {
	Person obj=new Person ("John","Doe",10,25,1900,"123-45-6789");
	obj.getFirstname();
	obj.getLastname();
	obj.getBirthmonth();
	obj.getBirthday();
	obj.getBirthyear();
	obj.getSsn();
	System.out.println(obj.getFirstname());
	System.out.println(obj.getLastname());
	System.out.println(obj.formatBirthday(10,25,1900)); 
	System.out.println(obj.getSsn());
	
	
	}
}
