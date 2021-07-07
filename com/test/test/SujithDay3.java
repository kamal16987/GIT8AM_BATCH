package com.test.test;

public class SujithDay3 {
	public static void main(String[] args) {
		String str = "Project class started";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			char charAt = str.charAt(i);
			for (int j = 0; j < ch.length; j++) {
				if (charAt == ch[j]) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println(charAt + "=" + count);
			}
		}
	}


	}


