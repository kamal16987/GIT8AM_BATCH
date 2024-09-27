package com.test.test;

public class Karthickday_3 {
		
		public static void amstrong(int num)
		{
		int r;
		int cube=0;
		int t=num;
		while(num>0)
		{
			r=num%10;
			cube=cube+(r*r*r);
			num=num/10;
		}
		if(t==cube)
		{
			System.out.println(t+" is amstrong number" );
		}
		else
		{
			System.out.println(t+" is not amstrong number");
		}
		}

		public static void main(String[] args) {
			
			amstrong(153);
			amstrong(152);
			

		}

	}

