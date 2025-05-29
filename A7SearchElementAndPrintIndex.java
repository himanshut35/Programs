package com.Arrays;

import java.util.Scanner;

public class A7SearchElementAndPrintIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,3,2,5,6,7,8,9,9,8,3,3,3,3,3,3,3,3};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element to  be searched");
		int searchElement=sc.nextInt();
		
		boolean ifFound=false;
		
		System.out.println("Element founnd at index");
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==searchElement) {
				System.out.println(i + "");
				ifFound=true;
			}
			
			
		}
		if(!ifFound) {
			System.out.println("Element not found");
		}

	}

}
