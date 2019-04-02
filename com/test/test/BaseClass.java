package com.test.test;

public class BaseClass {

	private void mergeConflict() {
		System.out.println("trying to resolve the merge conflict");

	}



	public static void main(String[] args) 
	{
	int num=0,sum=0, n=1234;
	
	while(n!=0)
	{
		num=n%10;
		sum=sum+num;
		n=n/10;
		
		
	}
		System.out.println(sum);
		
	}




}
