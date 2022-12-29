package com.assignment;

public class assignment_2_selectionSort {
	public static void main(String[] args) {
		int [] arr = {8,2,1,3,9,4,7,6,5};

		for (int i=0; i<arr.length-1; i++) {
			int smallest = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[smallest]>arr[j]) {
					smallest = j;
				}
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
			
		}
		for (int a: arr){
			System.out.print(a+" ");
		}
		}

	}

