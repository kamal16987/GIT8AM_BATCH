package com.test.test;

public class Ashok_Day3 {
	public static void main(String[] args) {
		String txt = "8Am Batch";
		System.out.println(txt);
		int A = txt.length();
		System.out.println("length of txt is - "+A);
		String B = txt.toUpperCase();
		System.out.println("uppercase of txt is - "+B);
		String [] C = txt.split(" ");
		for (int i = 0; i < C.length; i++) {
			System.out.println(C[i]);
		}
	}
}
