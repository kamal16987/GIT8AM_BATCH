package com.test.test;

public class PoonthamilanDayTow {
	public static void main(String[] args) {
		int sumofeven = 0, sumofodd = 0, evencount = 0, oddcount = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				evencount++;
				System.out.print("even no=" + i);
				sumofeven = sumofeven + i;
			} else if (i % 2 == 1) {
				oddcount++;
				System.out.println("\t" + "odd no=" + i);
				sumofodd = sumofodd + i;
			}
		}
		System.out.println();
		System.out.println("count of even number is: " + evencount);
		System.out.println("count of odd number is: " + oddcount);
		System.out.println("sum of even number is: " + sumofeven);
		System.out.println("sum of odd number is: " + sumofodd);
	}
}
