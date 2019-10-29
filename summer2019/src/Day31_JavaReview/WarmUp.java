package Day31_JavaReview;

import java.util.Arrays;
import java.util.Scanner;

public class WarmUp {
	
	public static void main(String[] args) {
		
  //  ask use to enter 3 number an find the max and min number.
		
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		
		 System.out.println("enter a number");
		 arr[0]  = scan.nextInt();
		 System.out.println("enter a number"); 
		 arr[1]  = scan.nextInt();
		 System.out.println("enter a number");
		 arr[2]  = scan.nextInt();
		 
		 System.out.println(Arrays.toString(arr));  // array i string e cvirdi
		 
		 Arrays.sort(arr);   // array i kucuk ten buyuge siraladi.
		 System.out.println("min value: "+ arr[0]);
		 System.out.println("max value: "+ arr[arr.length-1] );
		 
				
		
	}
	
	
	

}
