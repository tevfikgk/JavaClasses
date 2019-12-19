package com.class30;

public interface Bank {
	void haveChecking();
	void trust();
	void haveSavings();
interface Trustable{
	void trust();
}
}

class BOA implements Bank, Trustable{

	@Override
	public void haveChecking() {
		System.out.println("BoA has a checking account");
	}

	@Override
	public void haveSavings() {
		System.out.println("BoA has a saving account");
	}
	
	@Override
	public void trust() {
		System.out.println(" You can trust BoA has a saving account");
	}

}
class Finance {
	public void financing () {
		System.out.println("finance transaction.......");
	}
}
class CapitalOne extends finance implements Bank, Trustable{

	@Override
	public void haveChecking() {
		System.out.println("CapitalOne has a checking account");
	}

	@Override
	public void haveSavings() {
		System.out.println("CapitalOne has a saving account");
	}
	
	@Override
	public void trust() {
		System.out.println(" You can trust Capitalone has a saving account");
	}
}
	class CapitalOneChild extends CapitalOne{
		
	}
	

