package com.test.test;

public class Nandini {
	public static void main(String[] args) {
		String s = "hexaware@123";
		String a=s.substring(0,8);
		System.out.println(a);
		int count=0,count1=0;
		for (int i = 0; i < s.length(); i++) {
			char ch=a.charAt(i);
			if(ch=='e') {
				count++;
			}
	
		}
		System.out.println(count);
		System.out.println(count1);

	}

}
