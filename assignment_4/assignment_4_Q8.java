//WAP to find the maximum occurring character in a String.

package com.assignment_4;

public class assignment_4_Q8 {

	public static void main(String[] args) {
		
		String s1 = "Ineuron ineuron";
		String s2 = "";
		
// to remove white space
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)!=' ') {
				s2 = s2+s1.charAt(i);
			}
		}
		System.out.println(s2);
		
// to char array		
		char[] c1 = new char[s2.length()];
		
		for(int i=0; i<s2.length(); i++) {
			c1[i] = s2.charAt(i);
		}

// to Upper Case		
		for(int i=0; i<c1.length; i++) {
			if(c1[i]>=97 && c1[i]<=122) {
				c1[i]= (char) (c1[i]-32);
			}
		}
	
		int[] arr = new int[26];
		
		int index;
		for(int i=0; i<c1.length; i++) {
			index = c1[i]-65;
			arr[index] = arr[index]+ 1;
		}
		
///////
		
		int max=-1;
		int r_max=-1;
		for(int j=0; j<arr.length; j++) {
			if(max<arr[j]) {
				max = arr[j];
				r_max = j+65;
			}
		}
		char ch = (char)r_max;
		System.out.println("Maximum occuring character: "+ch);
		

	}
}
