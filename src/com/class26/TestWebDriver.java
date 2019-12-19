package com.class26;

public class TestWebDriver {

	public static void main(String[] args) {
		ChromeDriver chrome=new ChromeDriver();
		chrome.refresh();
		chrome.open();
		
		FireFoxDriver firefox=new FireFoxDriver();
		firefox.refresh();
		firefox.open();
		//creating object of child class, given reference to the parent class
		WebDriver driver=new ChromeDriver();
		driver.open(); //comes from child class
		driver.refresh();
	}

}
