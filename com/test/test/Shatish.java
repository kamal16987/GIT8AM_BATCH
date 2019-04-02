package com.test.test;

import java.util.Scanner;

public class Shatish {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Please enter the number ");
		
		long n = sc.nextLong();
		
    	long fact=1;
    	 
        for(int i=1;i<=n;i++)
  	  {

    	   fact=fact*i;
	 	  	}

	        System.out.println("factoral="+fact);
			}
}


