package com.company;

public class assignment_1_Q_4 {

	public static void main(String[] args) {
		int n=13;
		
		for (int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				if (i==n-1 || (j==0 && i>(n-1)/2) || (j==n-1 && i>(n-1)/2) ||
				(i>=(n-1)/2+j) || (j+i>=(3*n-1)/2)){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
