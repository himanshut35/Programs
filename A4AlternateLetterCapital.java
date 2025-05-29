package com.Arrays;

import java.util.HashMap;
import java.util.Map;

public class A4AlternateLetterCapital {
	
	public static void main(String[] args){
		
		String str="himanshuu";
		
		StringBuilder result=new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			
			char ch= str.charAt(i);
			if(Character.isLetter(ch))
			
			if(i%2==0) {
				result.append(Character.toUpperCase(ch));
			}
			else {
				result.append(Character.toLowerCase(ch));
			}
		}
		System.out.println(result);
		}
		
		
		
		 
		 
		

	}


