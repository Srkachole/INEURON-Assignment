package com.company;

import java.util.Scanner;

public class assignment_1_Q_2 {

	public static void main(String[] args) {
//		int n=4;
//		
//		for (int i=1; i<=n; i++) {
//			for(int j=1; j<=n; j++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
//	}
//}

		
//	Bubble Sort
		
		System.out.println("Please Enter the Array Size to Sort : ");
		Scanner sc = new Scanner(System.in);
		int dim = sc.nextInt();
		int [] ar = new int [dim];
		
		for (dim=0;dim<ar.length;dim++){
			System.out.println("Please Enter the value of array index: "+"["+dim+"]"); 
			ar[dim]= sc.nextInt();
		}
		for(int a: ar) {
			System.out.print(a+" ");
		}
			
		for(int i=0;i<ar.length;i++){
			for(int j=1; j<ar.length-i;j++) {
				if(ar[j] < ar[j-1]) {
					int temp = ar[j];
					ar[j] = ar[j-1];
					ar[j-1] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("Sorted array :");	
		for(int a: ar) {
			System.out.print(a+" ");
		}			
	}
}