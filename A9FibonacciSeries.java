package com.Java.programs;

public class A9FibonacciSeries {// the no is the sum of previous 2 digits

	public static void main(String[] args) {
		
		int n1=0;
		int n2=1;
		int sum=0;
		
		for(int i=0;i<7;i++) {
			
		
			System.out.print(sum + "--" );
			sum=n1+n2;
			n1=n2;
			n2=sum;
		}
		
		

	}

}
