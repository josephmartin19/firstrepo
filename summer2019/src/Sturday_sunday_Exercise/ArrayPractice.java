package Sturday_sunday_Exercise;

import java.util.Arrays;



public class ArrayPractice {

	public static void main(String[] args) {
		
		int [] arr = { 2, 3, 4, 2, 3, 5, 2};  // write a code to find unique value
		
		for ( int i =0; i< arr.length; i++) {
			
		    int count = 0;  // to find out how many time a value is appeared in the array
			
		    for ( int j = 0; j < arr.length; j++) {
		    	if (arr [i]== arr[j]) { 
		    		count++;    // everytime if the value is occured in the array, count will be increased by one
					
		    	}
		     }
		        if (count == 1) { // if only appeared once, we will print that value out
				System.out.print(arr[i]+ " ");
				
			}
			
			}	
		
		    System.out.println();
		
		String [] arr1 = { "B", "C", "C", "A", "B", "D", "E" };  // Write unique value
		
		 for ( int k = 0; k < arr1.length; k++) {
			 int count1 = 0;
			 
		for ( int l =0; l < arr1.length; l++)	{
			
			if ( arr1[k] == arr1[l]) {
				
				count1++;
			}
		}
			 if ( count1==1) {
				 System.out.print(arr1[k]+ " ");
			 }
			 
		 }
		 System.out.println();
		 
		String[] name = { "yusuf", "nazli", "efe", "eren", "kaan" };
		
		Arrays.sort(name);
		
		System.out.println(Arrays.toString(name));  // alphapetic order
		System.out.println(name[3]);              // 3. index
		System.out.println();
		
		int[] numbers = { 2, 3, 5, 8, 9, 10, 192, 123, 55 };
		
		Arrays.sort(numbers);                      // it sort to the bumbere 
		System.out.println(Arrays.toString(numbers));
		System.out.println("minumum number is "+ numbers[0]);
		System.out.println("max number is "+ numbers[numbers.length-1]);
		
		System.out.println("======================================================");
		
		int [][] numbers2D = { {1, 2}, {3, 4}, {5, 6,7,8,9,10,11} };
		
		 
		System.out.println(numbers2D[2][5]); // 10
		System.out.println(Arrays.toString(numbers2D[1])); // [3,4]
		System.out.println(Arrays.deepToString(numbers2D)); 
		
		
		

		}

	}