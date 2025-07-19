package com.Java.programs;

public class A16CalculateAlphabetsaaabbbccdd {

	public static void main(String[] args) {
		
		
		        String input = "aaabbccccddd";
		        String result = "";
		        int count = 1;

		        for (int i = 0; i < input.length() - 1; i++) {
		            if (input.charAt(i) == input.charAt(i + 1)) {
		                count++;
		            } else {
		                result = result + input.charAt(i) + count;
		                count = 1;
		            }
		        }

		        // Append the last character and its count
		        result = result + input.charAt(input.length() - 1) + count;

		        System.out.println(result);
		    }
		// using stringbuilder
	    /* 
        String input = "aaabbccccddd";
        StringBuilder compressed = new StringBuilder();

        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(input.charAt(i - 1));
                compressed.append(count);
                count = 1;
            }
        }
        // Append the last character and its count
        compressed.append(input.charAt(input.length() - 1));
        compressed.append(count);

        System.out.println(compressed.toString());
    }
}

	     * 
	     * 
	     * 
	     * */

	}


