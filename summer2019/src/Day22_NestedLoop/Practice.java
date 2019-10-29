package Day22_NestedLoop;

public class Practice {

	public static void main(String[] args) {

		for (int j = 1; j <= 5; j++) {

			for (int i = 1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();

		}
     System.out.println("==========================");
		/*
		 * ***** **** *** ** *
		 */

		for (int k = 5; k >= 0; k--) {

			for (int l = 1; l <= k; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}