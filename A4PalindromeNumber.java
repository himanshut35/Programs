package com.Java.programs;

public class A4PalindromeNumber {

	public static void main(String[] args) {
		int a=23432;
		int t=a;
		int r=0;
		
		while(t>0) {
			
			r=r*10+t%10;
			t=t/10;
		}
		
		if(r==a) {
			System.out.println("Palindrome");
		}
			
			else {
				System.out.println("not");
			}
		}

	}


