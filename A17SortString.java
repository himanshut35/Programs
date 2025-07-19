package com.Java.programs;

import java.util.Arrays;

public class A17SortString {

	public static void main(String[] args) {
		
		        String input = "himanshu";
		        
		        // Convert string to character array
		        char[] charArray = input.toCharArray();
		        
		        // Sort the character array
		        Arrays.sort(charArray);
		        
		        // Convert back to string
		        String sortedString = new String(charArray);
		        
		        System.out.println("Original String: " + input);
		        System.out.println("Sorted String: " + sortedString);
		    
		


	}

}
