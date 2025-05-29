package com.Java.programs;

public class B1SumOfArray {

	public static void main(String[] args) {
		int[] arr= {2,7,4,99,5};
		int total=0;
		
		for(int i=0;i<arr.length;i++) {
			
			total=total+arr[i];
		}
		System.out.println(total);

	}

}
