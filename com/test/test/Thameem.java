package com.test.test;

public class Thameem {
	public static void main(String[] args) {
		String str = "Project class was started";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			if (charAt == 's') {
				count++;
			}
			
		}
		System.out.println("count of s:"+count);
	}
}
