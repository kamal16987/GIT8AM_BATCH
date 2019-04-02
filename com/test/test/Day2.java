package com.test.test;

public class Day2 {
	
	public static void main(String[] args) {
		String s="     Welcome to project class",s2="Project class";
		int len=s.length();
		System.out.println(len);
		char c=s.charAt(9);
		System.out.println("9th charactor"+c);
	    boolean b=s.startsWith("wel");
		System.out.println("starts wit"+b);
		boolean e=s.endsWith("ct");
		System.out.println("ends with"+e);
		String r=s.toUpperCase();
		System.out.println(r);
		String t=s.toLowerCase();
		System.out.println(t);
		int y=s2.indexOf("j");
		System.out.println("Index of j"+y);
		for (int i = 0; i < s.length(); i++) {
			System.out.println("portrait"+i);
			}
		boolean o=s.equals(s2);
		System.out.println("s and s2 are equal "+o);
		String j=s.replace("to", "2");
		System.out.println(j);
		boolean g=s.contains(s2);
		System.out.println(g);
		String u=s.concat(s2);
		System.out.println(u);
		String[] x=s.split(" ");
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(s);
		String q=s.trim(); 
		
		System.out.println(q);
				
	}



}
