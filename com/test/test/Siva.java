package com.test.test;

public class Siva {
	public static void main(String[] args) {
		String dtr = "sridhar mani";
		int count = 0;
		for (int i = 0; i < dtr.length(); i++) {
			char charAt = dtr.charAt(i);
			if (charAt=='a') {
				count++;
				System.out.println(count);
			}
			
		}
	}

}
