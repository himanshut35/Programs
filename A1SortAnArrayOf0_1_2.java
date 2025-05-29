package com.Arrays;

import java.util.Arrays;

public class A1SortAnArrayOf0_1_2 {
	
	public static int[] sort(int[] arr) {
		
		int zeroCount=0;
		int oneCount=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				zeroCount++;
			}
			else if(arr[i]==1)
			{
				oneCount++;
			}
			
		}
		for(int j=0;j<zeroCount;j++) {
			arr[j]=0;
		}
		
		for(int k=zeroCount;k<(zeroCount+oneCount);k++) {
			arr[k]=1;
		}
		
		for(int l=(zeroCount+oneCount);l<arr.length;l++) {
			arr[l]=2;
		}
		return arr;
	}

	public static void main(String[] args) {
		
		int []arr1= {0,2,1,2,0,0,1,2,1,0};
		
		
		
		System.out.println(Arrays.toString(arr1));
		
		sort(arr1);
		
		System.out.println(Arrays.toString(arr1));
		
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i] + "-");
		}
		
	}

}
