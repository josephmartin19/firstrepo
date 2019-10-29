package Day26_ForEach;

import java.util.Arrays;

public class ForEach {

	public static void main(String[] args) {

		/*
		 * syntax: for (DataType each : ArrayName) {
		 * 
		 * 
		 */
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

   	    System.out.println();

		for (int each : arr) {
			System.out.print(each); // 12345
		}
		System.out.println();

		String[] str1 = { "A", "B", "C" };

		for (String each : str1) {
			System.out.print(each);// ABC
		}
		System.out.println();

		char[] ch = { 'z', 'x', 'y', 'c', 'a', 'b' };
		Arrays.sort(ch);

		for (char each : ch) {
			System.out.print(each);
		}
          System.out.println();
          
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // find the even number

		for (int each : arr1) {
			if (each % 2 == 0)
				System.out.print(each+ " ");
			
			System.out.println();
			
	// print out 1 - 20   we cant use for each.

		}

		
		
	}
}
