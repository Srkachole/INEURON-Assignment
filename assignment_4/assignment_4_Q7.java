//WAP to find if String contains all unique characters.

package com.assignment_4;

import java.util.Arrays;

public class assignment_4_Q7 {

	public static void main(String[] args) {
		
		String s1 = ("ABCD EFGHI");
		
		s1 = s1.replace(" ","");
		s1 = s1.toUpperCase();
		
		char[] c1 = new char[s1.length()];
		c1 = s1.toCharArray();
		
		Arrays.sort(c1);
		
		char [] arr = new char[c1.length];
		
		int index=0;
		int counter=0;
		for(int i=0; i<c1.length-1; i++) {
			if(c1[i+1]!=c1[i]) {
				arr[index] = c1[i];
				index++;
			}
			else {
				counter++;
			}
		}
		if(counter>0) {
			System.out.println("String does not contain unique character");
		}
		else {
			System.out.println("String contains unique character");
		}
		
	}
}
