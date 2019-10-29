package Day26_ForEach;

import java.util.Arrays;

public class ForEach_MultiD {

	public static void main(String[] args) {

		// n dementional array contains (n-1) dimensional arrays

		int[] arr1D = { 1, 2, 3, 4 };

		int[][] arr2D = { { 1, 2, 3, 4 }, { 5, 6, 7, 8, 9 } };
		// index 0 1
   
		
		for (int i = 0; i < arr2D.length; i++) {

			for (int j = 0; j < arr2D[i].length; j++) {
				System.out.print(arr2D[i][j] + " ");
			}

		}
		System.out.println();

		for (int[] each1 : arr2D) {
		for (int each2 : each1) {
				System.out.print(each2 + " ");
			}
		}
		System.out.println();

		String[][] str2D = { { "Bibish", "Syfo" }, { "Syfooo", "Julia" } };

		for (String[] each : str2D) {
			// System.out.println(Arrays.toString(each1DArray));

			// print each value saperate

			for (String EachValue : each) {
				System.out.print(EachValue+" ");
			}
		}
		System.out.println();
		
           int[][] num2D = { {1,2} , {3,4} };
		
		int [][][]num3D = { { {1,2}, {3,4} }, { {5,6}, {7,8} } };
		
		for(int [][] each1 : num3D) {
			for(int [] each2 : each1) {
				for(int each3  : each2) {
				System.out.print(each3);	
				}
			}
		}
		
		
	}
}
