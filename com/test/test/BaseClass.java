package com.test.test;

public class BaseClass {

	public static void main(String[] args) {
		System.out.println("Created a Baseclass...");
		System.out.println("I am going to modify the baseclass.");
		// WebDriver e = new chromeDriver();
	}

	public void setValueInTextBox() {

	}

	public void clickBtn() {
		System.out.println("Added clickBtn method");
	}

	public BaseClass() {

	}

	public void launchBrowser() {
		System.out.println("Added launch browser method");
	}

	public void selectDropdown() {
		System.out.println("Added select Dropdown method");
	}

	public void selectCheckbox() {
		System.out.println("Added select Checkbox method");
	}

}
