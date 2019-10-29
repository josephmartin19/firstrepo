package Day27_CustomMethods;

public class VoidMethod_WithArgument {

	/*
	 * method with argument
	 * 
	 * 
	 */
	public static void main(String[] args) {

		SumOfTwoNums(10, 20);
		SumOfTwoNums(45, 90);

		oddOrEven(50); // asagida int degerini aldik

//		int z = 100;

		oddOrEven(100);
		PowerOfNumber(8, 9);
		PowerOfNumber(20,15);
	}

	public static void SumOfTwoNums(int a, int b) {
		System.out.println("Sum of " + a + " and " + b + " is :" + (a + b));
	}

	public static void oddOrEven(int a) {
		if (a % 2 == 0) {
			System.out.println(a + " is Even number");
		} else {
			System.out.println(a + " is Odd number");
		}

	}

	public static void PowerOfNumber(int x, int y){

	  System.out.println((x * y));
	}
}
