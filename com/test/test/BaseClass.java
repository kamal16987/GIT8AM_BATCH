package com.test.test;

public class BaseClass {

	public static void main(String[] args) {
		int num = 0, sum = 0, n = 1234;

		while (n != 0) {
			num = n % 10;
			sum = sum + num;
			n = n / 10;

		}
		System.out.println("bbbbb");
		System.out.println(sum);
		System.out.println("hi");
		System.out.println("aaaaaaaa");
	}

}
