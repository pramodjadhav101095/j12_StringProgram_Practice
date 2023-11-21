package com.prowings.StringExcersise;

public class Palindrome_String_Check {
	
public static void main(String[] args) {
	
	String s = "RADAR";
	palindrome(s);
}
	
	
	
	public static String palindrome(String s) {
		
		StringBuffer sb = new StringBuffer(s);
		
	StringBuffer sb1=sb.reverse();
	System.out.println(sb1);
	
	String sb2 = sb1.toString();
	System.out.println(sb2);
	
	
	if(s.equals(sb2)) {
		
		System.out.println("is a palindrome String");
	}
	else {
		System.out.println("is not palindrome");
	}
	
//    char[]ch =s.toCharArray();
//	
//    for(int i=sb1.length()-1;i>=0;i--) {
//    	
//    	if(((sb1.charAt(i))==(ch[i])) ){
//    		
//    		System.out.println("is palinrome");
    		
 //   	}
  //  }
		
		return s;} 
}
