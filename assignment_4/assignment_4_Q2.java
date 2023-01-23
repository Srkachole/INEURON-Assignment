// WAP to print Duplicates characters from the String.
package com.assignment_4;

public class assignment_4_Q2 {

	public static void main(String[] args) {
		String s1 = "Abcde Abcccde";
		String s2 = "";
		String s3 = "";
		String s4 = "";
		
//		toLowerCase
		for (int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)>='A' && s1.charAt(i)<='Z') {
				s2 = s2 + (char)(s1.charAt(i)+32);  
			}
			else {
				s2 = s2 + s1.charAt(i);
			}
		}
		
//		to remove white space

		for (int i=0; i<s2.length(); i++) {
			if(s2.charAt(i)!= ' ') {
				s3 = s3 +s2.charAt(i);
			}
		}
		System.out.println("Original String is :"+s3);
		

// to find out duplicate letters
		
		int i,j;
		String count = "";
		for(i=0; i<s3.length(); i++) {
			for(j=i+1; j<s3.length(); j++) {
				if(s3.charAt(i) == s3.charAt(j)) {
					count = "" + s3.charAt(i);
					if(s4.contains(count)) {
						continue;
					}
					else {
						s4 = s4+ s3.charAt(i)+" ";
					}
				}	
			}
		}		
		System.out.println("Duplicate letters are : "+s4);
		
	}
}
