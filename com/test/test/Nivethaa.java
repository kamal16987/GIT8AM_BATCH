package com.test.test;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Nivethaa {
	private void countCharInString(String s) {
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		char[] ch = s.toCharArray();
		for (char c : ch) {
			if (charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c) + 1);
			} else {
				charCount.put(c, 1);
			}
		}
		Set<Entry<Character, Integer>> es = charCount.entrySet();
		for (Entry<Character, Integer> i : es) {
			System.out.println(i);
		}

		StringBuilder str2 = new StringBuilder();
		str2.append(s);
		str2 = str2.reverse();
		System.out.println("Reverse String using inbuilt fuction: ");
		System.out.println(str2);
		
		char[] char1= s.toCharArray();
		System.out.println("Reverse String without inbuilt fuction: ");
		for (int i = char1.length-1; i >= 0; i--) {
			System.out.print(char1[i]);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		Nivethaa co = new Nivethaa();
		co.countCharInString(str);
	}
}
