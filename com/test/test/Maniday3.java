package com.test.test;

public class Maniday3 {
	public void function() {
		System.out.println("function");
	}
	public void function(int a,int b) {
		System.out.println(a);
		System.out.println(b);
		
		
	}
	public static void main(String[] args) {
		Maniday3 ds=new Maniday3();
		ds.function();
		ds.function(23, 45);
	}

}
