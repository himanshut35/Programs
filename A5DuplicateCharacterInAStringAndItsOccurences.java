package com.Arrays;

import java.util.HashMap;
import java.util.Map;

public class A5DuplicateCharacterInAStringAndItsOccurences {
	
	public static void main(String[] args) {
		
		String str="HimanshuuTomar";
		
		char[] ch=str.toCharArray();
		
		Map<Character,Integer> n=new HashMap<>();
		
		for(Character c : ch) {
			
			if(n.containsKey(c)) {
				n.put(c, n.get(c)+1);			
			}
			else {
				n.put(c,1);
			}
		}
		System.out.println(n); // it will print all
		
		// to print duplicates
		for(Character c: n.keySet()) {
			if(n.get(c)>1) {
				System.out.println(c + " occured " + n.get(c) + " times");
			}
		}
	}

}
