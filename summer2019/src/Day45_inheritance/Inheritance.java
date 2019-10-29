package Day45_inheritance;

class TestBase {
	
	static String chromeDriver; // Default  null
	
	public static void TakeScreenShot() {
		System.out.println("Took screenshot");
	}
	
	public static void closeBrowser() {
		System.out.println("Browser Closed");
	}
}



public class Inheritance extends TestBase{
			// sub				 // super
	
// sub class is gonna interit all visible or protected featured from the class.
	
	public static void main(String[] args) {
		System.out.println(chromeDriver);
		
		TakeScreenShot();		
	}
	
	
	
}
