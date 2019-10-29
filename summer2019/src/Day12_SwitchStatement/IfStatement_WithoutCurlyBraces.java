package Day12_SwitchStatement;

public class IfStatement_WithoutCurlyBraces {
	
	public static void main(String[] args) {
		
		if(true) {
			System.out.println("hello");
		}else {
			System.out.println("World");
		}
		
		// without curly braces single line statement
		
	if(true)  // nested if:
		System.out.println("hello"); //its ok without curly braces one line can print
	
	else
		System.out.println("world");
	
	if(true)
		if(true)
			System.out.println("hello");
		else
			System.out.println("hello World");
			
		
	}

}
