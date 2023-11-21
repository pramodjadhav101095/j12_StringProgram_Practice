package com.prowings.StringExcersise;

import java.util.Arrays;

public class Anagram_String_Check {

	public static void main(String[] args) {
		
		String s1="Keep";
		String s2="peek";
		
		 checkAnagram(s1,s2);
	}
	
	
	
	
	public static String checkAnagram( String s1, String s2) {

		s1 = s1.replace(" ", "");
		s2 = s2.replace(" ", "");

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		boolean result = Arrays.equals(ch1, ch2);
		
		if(result==true) {
			System.out.println("String is Anagram");
		}
		else {
			System.out.println("String is not Anagram");
		}
		

		return null  ;
	}

}
