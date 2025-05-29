package ProgramsTest;

import java.util.Arrays;

public class A1CopyArraytoAnotherinREvOder {

	public static void main(String[] args) {
		
		int a[]=new int[4];
		a[0]=55;a[1]=52;a[2]=99;a[3]=2;
		
		int b[]=new int[4];
		
		System.out.println(a.length); // 4
		
		for(int i=0,j=a.length-1;i<4;i++,j--) { // remember ,
			
				b[j]=a[i];
			
		}
		System.out.println(Arrays.toString(b));
		

	}

}
