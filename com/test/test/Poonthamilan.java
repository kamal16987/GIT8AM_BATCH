package com.test.test;

public class Poonthamilan {
	public static void main(String[] args) {
		String str = "cloaning has successful";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			char charAt = str.charAt(i);
			if (charAt == 'a') {
				count++;
			}
			System.out.println(charAt + "=" + count);
		}
	}
}
