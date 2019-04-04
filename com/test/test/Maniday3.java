package com.test.test;

public class Maniday3 {
	public void function() {
		System.out.println("function");
	}
	public void function(int a,int b) {
		System.out.println(a);
		System.out.println(b);
		
		
	}
	public void function(String c,String d) {
		System.out.println(c);
		System.out.println(d);
		
	}
	public void function(float r,float u) {
		System.out.println(r);
		System.out.println(u);
	}
	public static void main(String[] args) {
		Maniday3 ds=new Maniday3();
		ds.function();
		ds.function(23, 45);
		ds.function("mani", "raj");
		ds.function(34.4f, 54.6f);
	}

}
