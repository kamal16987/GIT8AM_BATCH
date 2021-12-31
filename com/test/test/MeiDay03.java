package com.test.test;

public class MeiDay03 {
	public static void main(String[] args) {
		String s ="Merging process done successfully";
		String a=s.substring(0, 8);
		System.out.println(a);
	int count=0,count1=0;
	for(int i=0;i<a.length();i++) {
		char ch=s.charAt(i);
		if(ch=='m') {
			count++;
		}
		if(ch=='e') {
			count1++;
	}
	}
	System.out.println("count of a"+count);
	System.out.println(count1);
}
}