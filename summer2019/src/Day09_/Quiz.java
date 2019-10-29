package Day09_;

public class Quiz {
	public static void main(String[] args) {
		
		
		boolean a = !!!!!false;
		System.out.println(a);	//true	
		
	// question	1
		int x =100;
		double y = x+= 100/20; //105
		System.out.println(x);
		
		// question 2
		boolean A = 128>'9' || 128==127;   //  true
			//	      true	||  false
		System.out.println(A);	
		
		// qestion 3
		boolean StupidOperators = 10 >= 20 && 'a' > 'b'; // false
	//                            false   &&  true
		System.out.println(StupidOperators);
		
		// question 4
		int num1 = 999999;
		int num2 = 10;
		System.out.println(num1 * num2 / 10 % num1); // 0
		
		//question 5
		System.out.println(5 + 7 +"8"); // 12 + "8" ==> 128
		
		System.out.println(5+7 + "8" + 5+7); // 12 + "8" + 5+7 ==> 12857
		
		// question 6
		System.out.println( 1+11+"3" == "123"); // 12 + "3" == 123
		                                        //  123== 123 ==> true
		// question 7 
		int numA = 100;
		    numA += 300; // 400
		    System.out.println(numA++ + " "+ numA);
		//                     400           401
		    
		
	}    

}
