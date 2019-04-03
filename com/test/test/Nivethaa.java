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
		
		 char chars[] = s.toCharArray(); 
		         for(int i= chars.length-1; i>=0; i--) {
		             System.out.print(chars[i]);
		 
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
