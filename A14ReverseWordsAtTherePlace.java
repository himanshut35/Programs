package com.Java.programs;

public class A14ReverseWordsAtTherePlace {

	public static void main(String[] args) {
		
		String input="My name is Himanshu";
		
		String Reversed=" ";
		String result=" ";
		
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(ch == ' ') {
				result=result + Reversed;
				Reversed=" ";
				
			}
			else {
				Reversed= ch + Reversed;
			}
		}
		result=result + Reversed;
		System.out.println(result);

	}

}
