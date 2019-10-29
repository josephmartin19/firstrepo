package Day40_statickeyWord;

public class staticPractice {

	static long num1;
	long num2;

	public static void main(String[] args) {

		System.out.println(num1);  // 0
		System.out.println(staticPractice.num1);  // 0

		// System.out.println( num2 );
		// System.out.println( staticPractice.num2 );

		staticPractice.method1();  // ststic A

		// staticPractice.method2();

		staticPractice obj = new staticPractice();
		obj.method2();

		obj.method1();

	}

	public static void method1() {
		System.out.println("A");   // A
	}

	public void method2() {
		System.out.println("B");   // B
	}

}
