package Day41_initializerBlocks;

public class instanceBlock {    // instance block will ecxucute only if we declare object.
	
	public instanceBlock() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		instanceBlock obj1 = new instanceBlock();  // intance constructor
		instanceBlock obj2 = new instanceBlock();  // intance constructor
		instanceBlock obj3 = new instanceBlock();  // intance constructor
		
		
		
	}
}