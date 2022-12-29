//WAP to find the duplicates present in an array.

package com.assignment;

public class assignment_2_Q1 {

	public static void main(String[] args) {
		
		int[] arr = {11,1,2,3,3,2,8,5,4,1}; 
		
		System.out.print("Duplicate Elements are : ");
		for (int i=0; i<arr.length; i++) {
			int cindex = i;
			for (int j=i+1; j<arr.length; j++) {
				if(arr[cindex]==arr[j]) {
					System.out.print(arr[j]+ " "); 
				}
			}
		}
	}
}
