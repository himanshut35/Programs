package ProgramsTest;

import java.util.Arrays;

public class A2Anagram { // anagram is when two words ahve same alphabets/letter ...face/cafe

	public static void main(String[] args) {
		
		String a ="face";
		String b= "cafe";
		
		// syso ctrl+space will enter the system sttmnt
		char[]a1=a.toCharArray();
		char[]b1=b.toCharArray();
		
		//System.out.println(Arrays.toString(a1));
		//System.out.println(Arrays.toString(b1));
		
		Arrays.sort(a1);
		Arrays.sort(b1);
		
		if(Arrays.equals(a1,b1)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not anagram ");
		}
				
		

	}

}
