package com.assignment_4;

public class Assignment_4_Q3_palindrome {

	public static void main(String[] args) {
		
// have not used replace, toLowerCase, equals, reverse and toCharArray methods
		
		String S1 = "Shubham";
		String S2 = "";
    	
    	// to char Array
    	char [] c1 = new char[S1.length()];
    	
    	for(int i=0; i<S1.length(); i++) {
    		c1[i] = S1.charAt(i); 
    	}
    	
    	
    	// to remove white space
    	int x = 0;
    	int count =0;
    	int c2Size; 
    	for(int i=0; i<c1.length; i++) {
    		if(c1[i]==32) {
    			count++;   			
    		}
    	}
    	c2Size = c1.length-count;
    	
    	
    	char [] c2 =new char [c2Size];
    	
    	for(int i=0; i<c1.length; i++) {
    		if(c1[i]!=32) {
    			c2[x] = c1[i]; 
    			x++;
    		}
    		else {
    			continue;
    		}    		
    	}
    	
    	
    	// toLowerCase
    	for (int i=0; i<c2.length;i++) {
    		
    		if(c2[i]>='A' && c2[i]<='Z') {
    			c2[i]=(char)(c2[i]+32);
    		}
    	}
    	
    	//array reverse
    	int b=0;
    	char [] c3 = new char[c2.length];
    	
    	for(int i=c2.length-1;i>=0;i--) {
    		c3[b] = c2[i];
    		b++;
    	}
    	
    	for(char ch:c3) {
    		S2 = S2 + ch;
    	}
    	
    	int i=0;
		if(c2[i]==c3[i]) {
    		System.out.println("Yes "+S1+" : "+S2+" is a Palindrome");
    	}
		else {
			System.out.println("No "+S1+" : "+S2+" is not a Palindrome");
		}

	}

}
