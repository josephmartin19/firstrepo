package Day10_IfStatement;


public class if_else_Statement {
	
	 public static void main(String[] args) {
		
	/*
	 if & else:
	 
	    if ( condition ) {
	        //A if block get executed if the condition is true
	    }
	    else {
	       //B B block get executed if the condition is false
	    }
     */
	  
		if ( 9 <= 8) {
			System.out.println("9 is greather or equal 8");
		}
		else {
			System.out.println("8 is less than 9");
		}
		
		if (false ==  !false) {
			System.out.println("if block");
		}
		else {
			System.out.println("else block");
		}
		
		/*
		 Task01:
		    if score < 60 ==> failed
		    if score >= 60 but score < 90 ==> pass
		 */
		
		int score = 59;
		if ( score >= 60) {
			System.out.println("passed");
		} else {
			System.out.println("Failed");
		}
		/*
		 Task02:
		 1.declare three variable angel1, angel2 , angel3
		 2.write a program to check triangle is valid or not
		 */
		
		int angle1 =20, angle2=50, angle3= 75;
		
		boolean valid = (angle1+angle2+angle3)==180;
		
		if (valid) {
			System.out.println("it's a valid triangle");
		} else {
			System.out.println("invalid triangle");
		}
		
	}

}
