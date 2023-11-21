package com.prowings.StringExcersise;

public class SubString_Occurance {
	
	public static void main(String[] args) {
		String s = "Java Language to learn to Earn";
		
		substring_Occurance(s);
	}
	
	public static String  substring_Occurance(String s) {
		
		int s1 =s.indexOf("to");
		System.out.println(s1);
		return s;
		
		}

}
