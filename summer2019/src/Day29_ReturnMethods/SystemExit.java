package Day29_ReturnMethods;

public class SystemExit {
	
	public static void main(String[] args) {
		System.out.println(number());
		System.out.println("Done");
		
		}
	
	public static void method1() {
		System.out.println("hello word");
	}
	
	public static int number() {
		if (false) {
			System.exit(0);   // exit the java executition
		}
		
		return 5;
	}

}
