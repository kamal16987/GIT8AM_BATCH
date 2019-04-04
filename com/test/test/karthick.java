package com.test.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class karthick {
		
		public static void occurance(String str)
		{
			String words[]=str.split(" ");
			Map<String,Integer>word=new LinkedHashMap<String,Integer>();
			for(String s:words)
			{
				if(word.get(s)!= null)
				{
				word.put(s,word.get(s)+1);
				}
				else
				{
				word.put(s, 1);
		        }
				
			}
			System.out.println(word);
			System.out.println("********************");
		}

		public static void main(String[] args) {
		   occurance("good things happens to good people");
		   occurance("make things happen");
		   System.out.println("Checking Mergin concept");
		   System.out.println("Checking Mergin concept");
		   System.out.println("Checking Mergin concept");
		   System.out.println("Checking Mergin concept");
		   System.out.println("Checking Mergin concept");
		   System.out.println("Checking Mergin concept");
		   System.out.println("Checking Mergin concept");
		   occurance("leader is not the one who has too many fallowers, the one who "
		   		+ "creates many leaders is a great leader"); 

		}

	}



