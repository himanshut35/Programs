package com.Java.programs;

public class A12ReverseWholeSentence {

	public static void main(String[] args) {
		
		String input ="My name is himanshu";
		//String output ="himanshu is name yM";
		
		String[] words=input.split(" ");
		String reversedString="";
		
		for(int i=words.length-1;i>=0;i--)
		{
			reversedString += words[i] + " ";
		}
		
		System.out.println(reversedString.trim());
		
		
	}

}
