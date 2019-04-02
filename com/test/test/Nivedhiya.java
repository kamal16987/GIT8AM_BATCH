package com.test.test;

public class Nivedhiya {

	public static void main(String[] args) {
	
		       String s ="Welcome to Tech Mahindra to Chennai";

		       String[] strSplit =s.split(" ");

		       System.out.println(strSplit.length);

		       for(String v : strSplit){

		              System.out.println(v);

		       }

		      

		int count =0;

		       for(int i =0; i<strSplit.length; i++){

		              if(strSplit[i].equals("to")){

		              count++;

		              }     

		       }

		       System.out.println(count);

		}

		}

		 
	


