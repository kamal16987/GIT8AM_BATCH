package com.test.test;

public class Manikandan6726_Day3 {

	public static void main(String[] args) {
String str[]= {"alexa", "google","amazon", "flipkart", "google", "alexa"};
for (int i = 0; i < str.length; i++) {
	for (int j = i+1; j < str.length; j++) {
		if (str[i]==str[j]) {
			System.out.println("Duplicate  " + str[i]);
			
		}
	}
}	

	
	
	}

}
