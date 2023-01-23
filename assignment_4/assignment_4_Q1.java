// WAP to remove Duplicates from a String.


package com.assignment_4;

public class assignment_4_Q1 {

	public static void main(String[] args) {
		
		String s1 = ("Aa BB cc");
		String s2 = "";
		String s3 = "";
		String s4 = "";

// to remove white spaces
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)!=32) {
				s2 = s2 + s1.charAt(i);
			}
		}
		System.out.println(s2);

// to Upper Case		
		for(int i=0; i<s2.length(); i++) {
			if(s2.charAt(i)>=97 && s2.charAt(i)<=122) {
				s3 = s3 + (char)(s2.charAt(i)-32);
			}
			else {
				s3 = s3 + s2.charAt(i);
			}
		}
		System.out.println(s3);
		
	

// remove duplicate character		
		int i,j;
		String count = "";
		for(i=0; i<s3.length(); i++) {
			for(j=0; j<s3.length(); j++) {
				if(s3.charAt(i) != s3.charAt(j)) {
					count = ""+s3.charAt(i);
					if(s4.contains(count)) {
						continue;
					}
					else {
						s4 = s4+ s3.charAt(i);
					}
				}	
			}
		}		
		System.out.println("String after removing duplicate character : "+s4);
	

		
	}
}