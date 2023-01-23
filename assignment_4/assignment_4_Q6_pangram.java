//WAP to implement Pangram Checking with least inbuilt methods being used.

package com.assignment_4;

public class assignment_4_Q6_pangram {

	public static void main(String[] args) {
		
		String s1 = "Two driven jocks help fax my big quiz";
		String s2 = "";
		int[] arr = new int[26];
		int index;
		
// to remove white spaces
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)!=32) {
				s2 = s2 + s1.charAt(i);
			}
		}
		
// to char array
		char[] c1 = new char[s2.length()];
		for(int i=0; i<s2.length(); i++) {
			c1[i]=s2.charAt(i); 
		}

// to Upper Case		
		for(int i=0; i<c1.length; i++) {
			if(s2.charAt(i)>=97 && s2.charAt(i)<=122) {
				c1[i]= (char) (s2.charAt(i)-32);
			}
			else {
				c1[i] = s1.charAt(i);
			}
		}
		
//to check pangram
		for(int i=0; i<c1.length; i++) {
			index = c1[i] - 65;
			arr[index] = arr[index]+ 1;
		}
		
		int counter = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0) {
				counter++;
			}	
		}
		
		if(counter==26) {
			System.out.println("The String is Pangram");
		}
		else {
			System.out.println("The String is not Pangram");
		}
	}

}
