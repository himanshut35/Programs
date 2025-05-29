package com.Arrays;

import java.util.Arrays;

public class A8SortArray0_1 {

	public static void main(String[] args) {
		
		int a[]= {0,1,0,0,1,1,0,1,1,1,0,0,2};
		int zeroCount=0;
		int oneCount=0;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==0) {
				zeroCount++;
			}
			else if(a[i]==1) {
				oneCount++;
			}
			
		}
		
		System.out.println(zeroCount);
		System.out.println(oneCount);
		
		for(int i=0;i<zeroCount;i++) {
			a[i]=0;
		}
		
		for(int i=zeroCount;i<(zeroCount+oneCount);i++) {
			a[i]=1;
		}
		
		for(int i=(zeroCount+oneCount);i<a.length;i++) {
			a[i]=2;
		}
		
		System.out.println(Arrays.toString(a));

	}

}
