package com.test.test;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Nivethaa_Day3 {
	public static void main(String[] args) {
		int[] arr= new int[6];
		System.out.println("Enter array elements:");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			arr[i]=sc.nextInt();
		}
		Set <Integer> noDup = new LinkedHashSet<Integer>();
		for (Integer integer : arr) {
			noDup.add(integer);
		}
		System.out.println("After Removing duplicates");
		for (int i : noDup) {
			System.out.println(i);
		}
	}

}
