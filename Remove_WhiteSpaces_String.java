package com.prowings.StringExcersise;

public class Remove_WhiteSpaces_String {

	public static void main(String[] args) {
		whiteSpaceRemove("Learning Java Is Easy");

	}

	public static String whiteSpaceRemove(String s) {
		String s1 = s.trim();
		System.out.println(s1);
		
		String s2 = s.replace(" ", "");
		System.out.println(s2);

		return s;
	}
}
