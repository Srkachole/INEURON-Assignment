//WAP to count the number of consonants, vowels, special characters in a String.

package com.assignment_4;

public class assignment_4_Q4 {

	public static void main(String[] args) {
		
		String s1 = "Shubham_Kachole_1995@@$$ aeiou";
		String s2="";
		String s3="";
		String s4="";
		String s5="";
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		
		s1=s1.toLowerCase();
		s1=s1.replace(" ","");
		
		char [] c1 = new char [s1.length()];	
		
		c1 = s1.toCharArray();
		
		for(int i=0; i<c1.length; i++) {
			if(c1[i]==97 || c1[i]==101 ||c1[i]==105 ||c1[i]==111 ||c1[i]==117) {
				count2++;
				s3 =s3 + c1[i] + " ";
			}
			
			else if(c1[i]>=48 && c1[i]<=57) {
				count4++;
				s5 =s5 + c1[i] + " ";
				
			}
			else if(c1[i]>=98 && c1[i]<=122) {
				count1++;
				s2 =s2 + c1[i] + " ";
				
			} 
			
			else{
				count3++;
				s4 =s4 + c1[i] + " ";
			}			
		}
		System.out.println("Consonants are: "+count1+" = "+s2);
		System.out.println("Vowels are: "+count2+" = "+s3);
		System.out.println("Special characters are: "+count3+" = "+s4);
		System.out.println("Digits are: "+count4+" = "+s5);
	}
}
