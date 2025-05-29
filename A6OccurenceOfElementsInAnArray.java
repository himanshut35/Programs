package com.Arrays;

import java.util.HashMap;
import java.util.Map;

public class A6OccurenceOfElementsInAnArray {

	public static void main(String[] args) {
		
		int[] arr= {22,6,8,9,22,6,8};
		
		Map<Integer,Integer> n=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(n.containsKey(arr[i])) {
				n.put(arr[i], n.get(arr[i])+1);
			}
			else {
				n.put(arr[i], 1);
			}
		}
		
		System.out.println(n);
		
		// tom print
		for(Map.Entry<Integer, Integer> i: n.entrySet()) {
			System.out.println(i.getKey() + "--" + i.getValue());
		}
		}

	}


