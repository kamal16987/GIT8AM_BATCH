package com.test.test;

public class Ashok {
	public static void main(String[] args) {
		String txt = "you make mistakes. mistakes don't make you";
		System.out.println(txt);
		int count=0;
		for (int i = 0; i < txt.length(); i++) {
			char a=txt.charAt(i);
			if (a=='y') {
				count++;
			}
		}
		System.out.println("number of y in txt="+count);
	}
}
