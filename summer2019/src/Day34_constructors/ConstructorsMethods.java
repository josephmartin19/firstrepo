package Day34_constructors;

import java.lang.reflect.Constructor;

public class ConstructorsMethods {
	
	
	
		
//	Constructor obj = new Constructor()	;
		
		
	public ConstructorsMethods() {
		
		System.out.println("Default constructor");
		System.out.println("hello yusuf");
	}
	
	public ConstructorsMethods(int num) {  // we can do to many consturctor but has to be diffiren parameter
		System.out.println("Hello world");
	    System.out.println("i am a contructor with an argument of int");
		
	}
	
	
	
	public static void main(String[] args) {
		
		ConstructorsMethods obj = new ConstructorsMethods(8);   // i put int deger to print int num...
		
		
	}
	
	
	
	}


