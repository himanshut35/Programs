package com.Java.programs;

public class A15CapitalizeWord {

	public static void main(String[] args) {
		
		        String input = "My name is himanshu";
		        String[] words = input.split(" ");
		        StringBuilder capitalized = new StringBuilder();

		        for (String word : words) {
		            if (word.length() > 0) {
		                capitalized.append(Character.toUpperCase(word.charAt(0)))
		                           .append(word.substring(1).toLowerCase())
		                           .append(" ");
		            }
		        }
		        System.out.println(capitalized.toString().trim());
		    }
		


	}


