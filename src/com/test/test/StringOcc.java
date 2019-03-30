package com.test.test;

import java.util.Map;
import java.util.TreeMap;

public class StringOcc 
{
public static void main(String[] args) {

    String str = "Alan sam mayfus";
    char[] char_array = str.toCharArray();
    System.out.println("The Given String is : " + str);
    Map<Character, Integer> charCounter = new TreeMap<Character, Integer>();
    for (char i : char_array)
    {
    charCounter.put(i,charCounter.get(i) == null ? 1 : charCounter.get(i) + 1);
    }
    for (Character key : charCounter.keySet()) 
	{
	System.out.println("occurrence of '" + key + "' is  "+ charCounter.get(key));
	}

}

}