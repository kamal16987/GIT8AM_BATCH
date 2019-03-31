package com.test.test;

import java.util.Scanner;

public class Dinesh {

	public static void main(String[] args) {
		int flag=0;
		Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the string:");
	    String str=sc.nextLine();
	    System.out.println("which character you need to count");
	    char searchChar=sc.next().charAt(0);
	    for(int i=0;i<str.length();i++)
	    {
	    	if(searchChar==str.charAt(i))
	    		flag++;
	    }
	
	System.out.println(searchChar +" occurs "+ flag+" times");
}
}

		