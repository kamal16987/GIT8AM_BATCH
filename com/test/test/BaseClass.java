package com.test.test;

public class BaseClass {
	
	public void method()
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {

		
BaseClass bd=new BaseClass();
		bd.method();
	System.out.println("modified");	
	
	System.out.println("bbannu");

		int num = 0, sum = 0, n = 1234;

		while (n != 0) {
			num = n % 10;
			sum = sum + num;
			n = n / 10;

		}
		System.out.println(sum);
		System.out.println("hi");
	}


}

