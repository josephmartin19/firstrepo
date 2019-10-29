package Day27_CustomMethods;

import java.util.Arrays;

public class WarmUp {
	
	public static void main(String[] args) {
		
	/*  crwate an int array called numbers that has lenght of 100
	 * assing 1- 100 to keep array indexes
	 * 	use for each loop to print out all the even number
	 */
		
	int []numbers;
	numbers = new int[100];
	
	for(int i=1; i<=100; i++) {
		numbers [i-1]=i;
	// numbers [i] = i+1
	}
		System.out.println(Arrays.toString(numbers));
		// use for each to find even numbers
		
		for( int each : numbers) {
			if (each %2 !=0) {
				continue;
			}
			System.out.print(each+" ");
		}
	}

}
