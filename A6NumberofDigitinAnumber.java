package com.Java.programs;

public class A6NumberofDigitinAnumber {

	public static void main(String[] args) {
		
		int a=1237745;
		int count=0;
		
		while(a>0) {
			int r=a%10;
			a=a/10;
			
			count++;
		}
		System.out.println(count);

	}

}
