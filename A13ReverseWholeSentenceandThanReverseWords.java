package com.Java.programs;

public class A13ReverseWholeSentenceandThanReverseWords {

	public static void main(String[] args) {
		
		String input ="My name is himanshu";
		//String output ="uhsnamih si eman yM";
		
		//String[] words=input.split(" ");
		String reversedString="";
		
		for(int i=0;i<input.length();i++)
		{
			
			reversedString = input.charAt(i) + reversedString;
		}
		
		System.out.println(reversedString);
		
		
	}

	}


