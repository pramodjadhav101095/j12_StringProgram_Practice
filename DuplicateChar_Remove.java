package com.prowings.StringExcersise;

public class DuplicateChar_Remove {
	
	public static void main(String[] args) {
		String s = "ABBACCCHKL";
		String stringWithoutDuplicates = removeDuplicates(s);

		System.out.println("Original String: " + s);
		System.out.println("String without Duplicates: " + stringWithoutDuplicates);
	}

	public static String removeDuplicates(String input) {
		StringBuilder res = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);

			if (!res.toString().contains(String.valueOf(currentChar))) 
			{
				res.append(currentChar);
			}
		}

		return res.toString();
	}

}


