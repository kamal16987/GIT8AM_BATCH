package com.test.test;

public class BaseClass {
	
	private void mergeConflict() {
		 System.out.println("trying to resolve the merge conflict");

	}

	public static void main(String[] args) {
		System.out.println("Created a Baseclass...");
		
		BaseClass print = new BaseClass();
		
		print.mergeConflict();
		
		

	}

}
