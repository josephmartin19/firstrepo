package Day08_ShortHandOperators;

public class LogicalOperators {
	
	public static void main(String[] args) {
		
	
	
	/*
	  && :  And logic   true && true, if condition are true
	  || : Or logic  
	                     true || false ==>true
	                     true || true  ==>true
	                    false || false ==> false
	 */

	boolean ResultA = 9==0 && "yusuf" =="good";
	//				false			false
	
	System.out.println(ResultA);
	
	boolean ResultB = 8>5 && 7==(8-2+1);
			//	     true	&&	true  ==> true
	
	
	boolean ResultC = !false != true && !false ==! (!true);
	//				 	true != true &&  true  == ! false
	//						false    &&  true ==>> flase
	System.out.println(ResultC);
	
	//  ||:
	 boolean  A = "Monday" == "Funday" || 6==6;
	 //						false    || true ==> true
	 System.out.println(A);
	 
	 boolean C = !(8>5) || !("Today" != "friyday");
	//          ! true || !true		
    //            false || false
	 System.out.println(C);
	 
	 boolean E = !(7 > 5 && 6 != 5) && ( 9 > 5 || 10 > 4);
	 //          ! true      &&  true
	 //           false   &&    true
	 System.out.println(E);
	}
}
