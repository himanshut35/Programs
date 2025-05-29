package com.Java.programs;

public class A8SumOfDigitsInaNumberInJava {

	public static void main(String[] args) {
		
		int a=12344;
		int r=0;
		while(a>0) {
			
		 r=r+a%10;//0+4(4)+
			a=a/10;
		}
		
		System.out.println(r);
	}

}
