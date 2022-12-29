// Merge Sort  
package com.assignment;



class sort{
	 public static void mergeSort(int[] arr) {
		
		 int size = arr.length;
		 		 
		 if (size <= 1) {
			 return;
		 }
		 
		 int mid = size/2;
		 int[] arr_left = new int[mid];
		 int[] arr_right = new int [size - mid];
		 
		 int i=0;
		 int j=0;
		 
		 for(i=0; i < size; i++) {
			 if(i<mid) {//idx_start<idx_mid
				 arr_left[i] =arr[i]; 
			 }
			 else {
				 arr_right[j] = arr[i];
				 j++;
			 }
		 }
		 mergeSort(arr_left);
		 mergeSort(arr_right); 
		 merge(arr_left,arr_right,arr);
	 }

	public static void merge(int[] arr_left,int[] arr_right,int[] arr ) {
		
		int leftSize = arr.length/2 ;     //arr_left.length ;
		int rightSize = arr.length - leftSize ;  //arr_right.length;
		int a = 0;
		int b = 0;
		int i = 0;
		
		while(a < leftSize && b < rightSize) {
			if(arr_left[a]<arr_right[b]) {
				arr[i] = arr_left[a];
				a++;
				i++;
			}
			else {
				arr[i] = arr_right[b];
				i++;
				b++;
			}
		}
		while(a < leftSize) {
			arr[i] = arr_left[a];
			a++;
			i++;
		}
		while(b < rightSize) {
			arr[i] = arr_right[b];
			i++;
			b++;
		} 
	}
}

public class assignment_2_mergeSort {
	
	public static void main(String args[])	{   	
		
	    int[] array = {8,2,1,3,9,4,7,6, 5 };
	    
	   sort.mergeSort(array);
	    
	    for(int i = 0; i < array.length; i++){
	        System.out.print(array[i]+ " ");
	    }
	}

}