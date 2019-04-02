package com.test.test;

public class BaseClass {
	
	public void GitProcess()
	{
		System.out.println("Baseclass changed");
	}

	public void Gitprocess1()
	{
		System.out.println("Modification verified");
	}
	public static void main(String[] args) {
		
BaseClass bc=new BaseClass();
		bc.GitProcess();
		bc.Gitprocess1();
	System.out.println("Done");	

}

}