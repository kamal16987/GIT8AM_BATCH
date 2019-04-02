package com.test.test;

public class BaseClass {

	private void mergeConflict() {
		System.out.println("trying to resolve the merge conflict");

	}

	public static void main(String[] args) {
		System.out.println("Created a Baseclass...");

		BaseClass print = new BaseClass();

		print.mergeConflict();
		// >>>>>>> 2bd249edab17b962cba670c387fd178c8a4ffbc2
		System.out.println("modified");
		System.out.println("deleted the method");
	}

	public void Quitbrowser() {
		System.out.println("close browser");
	}

}
