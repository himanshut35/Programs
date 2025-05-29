package com.Arrays;

import java.util.Arrays;

public class A3SecondSmallestNoInAnArray {
	

		
		
	
	public static void main(String[] args) {
		
		int[] arr= {9,7,5,3,77,44,23};
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
		
		// to find max
		System.out.println(arr[arr.length-1]);
		
		System.out.println(arr[1]);
		
	}

}
