package com.prowings.StringExcersise;

public class Remove_DuplicateChar_String {

	public static void main(String[] args) {

		String s = "JAVA";
		duplicate(s);
	}

	public static String duplicate(String s) {
		s.trim();
		char[] ch = s.toCharArray();
		StringBuffer sb = new StringBuffer(s);
      
		for (int i = ch.length - 1; i >= 0; i--) {
			for (int j =0; i < ch.length; j++) {

				if (ch[i] != ch[j]) {
					
					

					System.out.println(sb.append(ch));
				}

			}

		}

		return s;

	}

}
