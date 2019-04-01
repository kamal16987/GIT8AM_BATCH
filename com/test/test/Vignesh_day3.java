package com.test.test;

import java.util.Scanner;

public class Vignesh_day3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the empId");
		int empId=sc.nextInt();
		System.out.println("enter the age");
		int Age=sc.nextInt();
		if(empId==12||Age==58)
		{
			System.out.println("Senior HR");
		}
		else {
			System.out.println("HR");
		}
	}
	

}
