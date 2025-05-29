package com.Java.programs;

public class A10FactorialOfaNumber {

	public static void main(String[] args) {
		
		int num=8;
		
		long factorial=1;
		
		for(int i=2;i<=num;i++) {
			factorial=factorial*i;
			
		}
		System.out.print(factorial);

	}

}
