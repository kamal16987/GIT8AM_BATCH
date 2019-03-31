package com.test.test;

public class Vickeybala
{
	public static void main(String[] args) 
	{
		String s = "cloaning has successful";
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++)
		{
			int count = 0;
			char charAt = s.charAt(i);
			for (int j = 0; j < c.length; j++)
			{
				if (charAt == c[j])
				{
					count++;
				}
			}
			if (count > 0) {
				System.out.println(charAt + "=" + count);
			}
		}
	}
}
