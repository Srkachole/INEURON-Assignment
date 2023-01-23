//WAP to implement Anagram Checking least inbuilt methods being used.

package com.assignment_4;

public class assignment_4_Q5_Anagram {

	public static void main(String[] args) {
		String s1 = "elegant man";
		String s2 = "A gentle man";
		
		char[] c1 = new char[s1.length()];
		char[] c2 = new char[s2.length()];
    	
// to char array
    	for(int i=0; i<s1.length(); i++) {
    		c1[i] = s1.charAt(i); 
    	}
    	
    	for(int i=0; i<s2.length(); i++) {
    		c2[i] = s2.charAt(i); 
    	}
    	
// to remove white space
    	int x = 0;
    	int y = 0;
    	int count1 =0;
    	int count2 =0;
    	int c1Size;
    	int c2Size; 
    	
    	for(int i=0; i<c2.length; i++) {
    		if(c2[i]==32) {
    			count2++;   			
    		}
    	}
    	c2Size = c2.length-count2;
    	
    	for(int i=0; i<c1.length; i++) {
    		if(c1[i]==32) {
    			count1++;   			
    		}
    	}
    	c1Size = c1.length-count1;
    	
    	
    	char [] c11 =new char [c1Size];
    	
    	for(int i=0; i<c1.length; i++) {
    		if(c1[i]!=32) {
    			c11[x] = c1[i]; 
    			x++;
    		}
    		else {
    			continue;
    		}    		
    	}
    	char [] c22 =new char [c2Size];
    	
    	for(int i=0; i<c2.length; i++) {
    		if(c2[i]!=32) {
    			c22[y] = c2[i]; 
    			y++;
    		}
    		else {
    			continue;
    		}    		
    	}

// to Lower Case Array c11    	
    	for (int i=0; i<c11.length;i++) {
    		
    		if(c11[i]>='A' && c11[i]<='Z') {
    			c11[i]=(char)(c11[i]+32);
    		}
    	}
// to Lower Case Array c22    	
    	for (int i=0; i<c22.length;i++) {
    		
    		if(c22[i]>='A' && c22[i]<='Z') {
    			c22[i]=(char)(c22[i]+32);
    		}
    	}
    	
// Array c11 Sorting
		for(int i=0;i<c11.length;i++){
			for(int j=1; j<c11.length-i;j++) {
				if(c11[j] < c11[j-1]) {
					char temp = c11[j];
					c11[j] = c11[j-1];
					c11[j-1] = temp;
				}
			}
		}
// Array c22 Sorting		
		for(int i=0;i<c22.length;i++){
			for(int j=1; j<c22.length-i;j++) {
				if(c22[j] < c22[j-1]) {
					char temp = c22[j];
					c22[j] = c22[j-1];
					c22[j-1] = temp;
				}
			}
		}
//checking c11 equals c22
		
		int counter = 0;
		if(c11.length==c22.length) {
			for (int i=0; i<c11.length; i++) {
				if(c11[i] == c22[i]) {
					counter++;
				}
			}
			if(counter==c11.length) {
				System.out.println("It is an anagram");
			}
			else {
				System.out.println("It is not a anagram");
			}
		}
		else {
			System.out.println("It is not an anagram");
		}
	}
}
