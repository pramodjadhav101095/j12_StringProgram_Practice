package com.prowings.StringExcersise;

public class Reverse_String {
	
	
	public static void main(String[]args) {
		
		reversestring("Prowings");
	}
	
	
	public static String reversestring(String s) {
		
		StringBuffer sb= new StringBuffer(s);
	StringBuffer sb1=sb.reverse();
	System.out.println(sb1);
		
		return s;}

}
