package com.test.test;

import java.util.Scanner;

public class Manikandan {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String s=sc.next();
			int c1=0;
			int c2=0;
			int c3=0;
			int c4=0;
			
			String upper="";
			String lower="";
			String  numbers="";
			String spl="";
			for (int i = 0; i < s.length(); i++) {
				char ch=s.charAt(i);
				if (Character.isUpperCase(ch)) {
					upper=upper+ch;
					c1++;
					}
				else if (Character.isLowerCase(ch)) {
					lower=lower+ch;
					c2++;
					}
				else if (Character.isDigit(ch)) {
					numbers=numbers+ch;
					c3++;
					
					}
				else {
					spl=spl+ch;
					c4++;
					
					
					
				}
				
			}
			System.out.println("display upper case:"+""+upper);
			System.out.println("display lowercase:" +""+lower);
			System.out.println("display special numbers:"+""+numbers);
			System.out.println("display special:"+""+spl);
			
			
		}
		


}
