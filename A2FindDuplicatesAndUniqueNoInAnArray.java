package com.Arrays;

import java.util.HashSet;
import java.util.Set;

public class A2FindDuplicatesAndUniqueNoInAnArray { // find duplicates and remove duplicates

	public static void main(String[] args) {
		
		int[] arr= {0,2,4,6,0,4,2,7,9,0};
		
		Set<Integer> uniqueNumbers=new HashSet<>();
		boolean isDuplicateExist=false;
		
		for(int i=0;i<arr.length;i++) {
			if(uniqueNumbers.contains(arr[i])) {
				isDuplicateExist=true;
				System.out.println("Duplicate element - " + arr[i]);
				
			}
			else {
				uniqueNumbers.add(arr[i]); 
			}
		}
		
	System.out.println(uniqueNumbers); //[0, 2, 4, 6, 7, 9]

	}

}
