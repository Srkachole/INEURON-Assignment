package com.assignment;


class ABC {
	public static int partition(int[] arr,int low, int high ) {
		int pivot = arr[high];
		int i = low-1;
		
		for(int j=low; j<=high ; j++) {
			if(pivot > arr[j]) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;				
			}	
		}
		i++;
		int temp = arr[i];
		arr[i] = arr[high];
		arr[high] = temp;
		
		return i;
	}
	
	public static void quickSort(int []arr, int low, int high) {
		if(low<=high) {
			int pivIdx = partition(arr,low, high);
			
			quickSort(arr, low, pivIdx-1);
			quickSort(arr, pivIdx+1, high);
		}
	}
}

public class assignment_2_quickSort {	
	public static void main(String[] args) {
		
		int [] array = {8,2,1,3,9,4,7,6,5 };
		int high = array.length-1;
		
		ABC.quickSort(array, 0, high);
		
		for(int a : array) {
			System.out.print(a + " ");
		}
	}
	
}
