package com.test.test;

import java.util.Scanner;

public class Vignesh_StringOccurance {

	public void display() {
		System.out.println("to display the string occurance value ");
	}

	public void branchOne() {
		System.out.println("Branch 1 value were been added");

	}
	public void branchTwo() {
		System.out.println("Branch 2 value were been added");
	}

	public static void main(String[] args) {
	Vignesh_StringOccurance v= new Vignesh_StringOccurance();
		v.display();
		v.branchOne();
		v.branchTwo();
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to find string occurance");
	    String s = sc.next();											
	    System.out.println("Enter a character to count in the string " + s);
	    char c = sc.next().charAt(0); 							
	      int a = 0;
	      for (int i = 0; i < s.length(); i++) {
	      if (c == s.charAt(i)) {
	                a++;
	            }
	        }
	    System.out.println(c + " occurs " + a + " times in the given string ");
	}

}
