package com.test.test;


public class Razeed {
	public void empId(String name) {
		System.out.println("string method " +  name);
	}
		public void empId(long phno,char block) {
			System.out.println(phno+"\n"+block);

	}
		public static void main(String[] args) {
			Razeed a=new Razeed();
			a.empId("razeed");
			a.empId(9626097420l, 'b');
		}

}
