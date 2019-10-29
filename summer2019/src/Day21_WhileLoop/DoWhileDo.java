package Day21_WhileLoop;

public class DoWhileDo {

	public static void main(String[] args) {

		boolean A = false;

		while (A) { // false statement will not print anything will go down nex line
			System.out.println("Hello");
		}

		do {
			System.out.println("hello"); // will print "hello" in do statement.
		} while (A);

		System.out.println("===================================");

		int x = 1;
		while (x <= 100) {
			if (x % 2 == 0) {
				System.out.print(x + " ");
			}

			x++;
		}
		System.out.println("====================");

		for (int y = 1; y <= 100; y++)
			if (y % 2 == 0) {

				System.out.print(y + " ");
			}

	}
}