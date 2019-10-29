package Day25_ArrayContinue;

public class WarmUp {

	public static void main(String[] args) {
		
	// 1. write a program that can print out the unique values from the an int Array ex==>
	//  if arr --> { 1,1,2,3,3}    output: 2 
	// if arr --> { 1,2,2,3,4,4}   output: 1 3 	
		
		int [] arr = { 1,1,2,3,4,5,1,-1};
		
		for ( int j =0; j< arr.length; j++) {
			
			int count = 0;  // to find out how many time a value is appeared in the array
		
	    for ( int i = 0; i < arr.length; i++) {
	    	if (arr [i]== arr[j]) { 
	    		count++;    // everytime if the value is occured in the array, count will be increased by one
				
	    	}
	     }
	        if (count == 1) { // if only appeared once, we will print that value out
			System.out.print(arr[j]+ " ");
			
		}
		
		
		
		
		}	

	}

}