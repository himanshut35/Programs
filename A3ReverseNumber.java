package com.Java.programs;

public class A3ReverseNumber {

	public static void main(String[] args) {
		
		int a=1234;
		int r=0;
		
		while(a>0) {
			r=r*10+a%10;// 0+4(4),40+3(43)+430+2(432)+4320+1(4321)
			a=a/10;//123,12,1,
		}
		
		System.out.println(r);

	}

}
