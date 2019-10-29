package AritmeticOperators;

public class PrimativesCasting {
	
	/*
	  casting: converting larger primitive to smaller size
	           datatype variablename = (datatype) value
	   
	 */

	private static final byte largestNumber = 0;

	public static void main(String[] args) {
		int a = 10;
		int b = (byte) a; // explicit casting
		System.out.println(b);
		
		double DecimalNumber = 10.5;
		float FloatNumber =	(float)DecimalNumber;  // double > float
		System.out.println(FloatNumber);
		
		long LongNumber = 300L;
		int intNum = (int) LongNumber;
		
		System.out.println(intNum);
		
		// implicit casting:  
		
		  byte ByteNum = 100;
		  int Intnum2 =ByteNum;
		  
		  int intNum3 = (int) ByteNum;
		  
		  short ShortNum =100;
		  long Longnum2 = ShortNum;
		  // same with
		  long longNum3 = (long) ShortNum;
		  
	// explicit casting practices:
		  
		  double largestNumber = 100.8765;
		  byte ByteValue =  (byte)largestNumber;
		    
		  System.out.println(ByteValue);
		  
		  float FloatNumber2 = 500.67F;
		  short mynumber = (short)FloatNumber2;
		  
		  System.out.println(mynumber);
	
		  
		//  int Num1 = 100;    ayni type oldugunda arada virgul koyup yapaniliriz.
		//  int Num2 = 200;    
		//  int Num3 = 300;
		  
		  int Num1 = 100 , Num2 = 200 , num3 = 300;
		  
				  
		  
		  
		  
		
	}
}
