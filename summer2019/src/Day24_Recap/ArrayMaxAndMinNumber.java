package Day24_Recap;

import java.util.Arrays;

public class ArrayMaxAndMinNumber {
	
	
	public static void main(String[] args) {
		
		
	int[] arr = { 100,99,1,3,4,5,6 };
	      int min = 9999999;
	
	for(int i=0; i< arr.length; i++ ) {
		if (arr[i] < min) {
			min = arr[i];
		}
	}
		
		System.out.println("minumum number is: "+ min);
		
		System.out.println("===============================");
		
		int[] arr5 = { 100,99,1,3,4,5,6 };
		
	    Arrays.sort(arr5);
	   System.out.println(Arrays.toString(arr5));  //  [1, 3, 4, 5, 6, 99, 100]
	 
		
		
		 int secondMinimum = 99999999;
	        for(int j=0; j < arr.length; j++) {
	            
	            if(arr[j] < secondMinimum && arr[j] > min) {
	                secondMinimum = arr[j];
		
	}

	        }            
	          System.out.println("second Minimum: "+secondMinimum);
	 
	          
	          int [] arr1 = { 3,5,7,90,10,212 };
	     	 int max = 0;
	     	 
	     	 for ( int k =0; k < arr1.length; k++) {
	     		 if ( arr1[k] > max) {
	     			 
	     			 max = arr1[k];
	     		 }
	     	 }
	     	    System.out.println("max: "+ max);     //   212   
	}
	
}
