package com.Java.programs;

public class A7EvenAndOddNumbersInNumber {

	public static void main(String[] args) {
		
		int a=11111;
		int odd=0;
		int even=0;
		
		while(a>0) {
			
			int r=a%10;
			//System.out.println(r);
			
			a=a/10;
			//System.out.println(a);
			
			
			if(r%2!=0) {
				odd++;
			}
			else {
				even++;
			}
		}
		System.out.println(odd);
		System.out.println(even);

	}

}
