//WAP to check whether an array is a subset of another array.


package com.assignment;

class set{
	public static boolean subset(int [] arr1, int[] arr2) {
		int i, j;
		for (i = 0; i < arr2.length; i++) {
            for (j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    break;
                }
            }
            if (j == arr1.length) {
                return false;
            }
        }
		return true;
	}
}

public class assignment_2_Q6 {
	public static void main(String[] args) {
		int arr1[] = { 11, 1, 13, 21, 3, 7 };
        int arr2[] = { 11, 3, 7, 1};
        
        boolean b = set.subset(arr1, arr2);
        if(b==true) {
        	System.out.println("arr2 is subset of arr1");
        }
        else {
        	System.out.println("Not a subset");
        }
	}
}
