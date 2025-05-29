package com.Java.programs;

public class A5PalindromeString {

	public static void main(String[] args) {
		
		String str1="himanshu";
		String str2="";
		
		for(int i=str1.length()-1;i>=0;i--) {
			
			str2=str2+str1.charAt(i);
			
		}
		System.out.println(str2);
		
		if(str1.equals(str2)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not");
		}
		

	}

}
