package Day24_Recap;

public class ArrayClass {

	public static void main(String[] args) {

		/*
		 * Array Declaration: 1. DataType[] VariableName= { value1 , Value2,.....} 2.
		 * DataType VariableName[] = {value1, value2, ...}
		 */

		/*
		 * Array Declerations: 1. DataType[] VariableName = { Value1,Value2,...}; 2.
		 * DataType VariableName[] = { Value1,Value2,...};
		 */
		int a = 10;
		int[] arr = { 10, 20, 30 };

		int arr2[] = { 10, 20, 30 };

		char[] arr3 = { 'A', 'B', 'C' };

		String arr4[] = { "Ibrahim", "Filiz", "Aysel" };
		// index : 0 1 2

		// String name = arr4[3]; // index 3 is not exist
		String name = arr4[2];
		System.out.println(name);

		/*
		 * initialize the size of arry: int[] arr = new int[size]
		 */

		String[] MyNumbers = new String[5];
		for (int i = 0; i < MyNumbers.length; i++) {
			System.out.println(MyNumbers[i]);
		}
		System.out.println("    ");
		/*
		 * default values: int, byte, short, long ==> 0 double & float ==> 0.0 boolean
		 * ==> false char ==> space
		 * 
		 * String ==> null
		 */

		// Assign values:
		int[] ch = new int[3];
		ch[0] = 10;
		ch[1] = 20;
		ch[2] = 30;

//      ch[3] = 40;
//      System.out.println( ch[3] );

		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " "); // 10 20 30
		}
		System.out.println();
		
		System.out.println("==========================");
		

		ch = new int[4];
		// reinitialized it's size, and preveious values of array are lost

		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " "); // 0 0 0 0
		} // array's size is fixed

		System.out.println();

		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 4, 5, 6 };

		int[] array3 = new int[array1.length + array2.length];

		for (int i = 0; i < array1.length; i++) {
			
			// assigning array1' each index to the array3
		}

      	 
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + " ");
		}

	}

}
