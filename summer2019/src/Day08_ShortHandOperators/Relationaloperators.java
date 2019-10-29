package Day08_ShortHandOperators;

public class Relationaloperators {
	/*
	  Relatinal Operators : return boolean expression
	   > : greater than
	  <= : greater than or equal
	   < :less than
	  <= :less than equal
	  == :equal 
	  != : not equal
	   ! : logical opposite
	 */
	public static void main(String[] args) {
		
		System.out.println(10 > 9);
		boolean resultA = 10 > 9;
		System.out.println(resultA);
		
		boolean resultD = 1100 < 1200;
		System.out.println(resultD);
		
		boolean resultE = 1000 < 1000;
		System.out.println(resultE);
		
		boolean resultF = 1000 <= 1000;
		System.out.println(resultF);
		
		// !
		boolean resultH = 20!=20;
		System.out.println(resultH);
		
		boolean resultG = 20!=21;
		System.out.println(resultG);
		
		boolean A = ! false;
		System.out.println(A);
		
		boolean C = !false != !true;  // ! false ==> true  
		System.out.println(C);
		
		System.out.println("cybertek" != "club");
	}

}
