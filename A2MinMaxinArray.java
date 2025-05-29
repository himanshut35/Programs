package com.Java.programs;

public class A2MinMaxinArray {

	public static void main(String[] args) {
		
		int[] arr= {1,5,8,55,466};
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<=arr.length-1;i++) {
			
			if(arr[i]>max) {
				max=arr[i];
			}
			
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(min);
		System.out.println(max);

	}

}
