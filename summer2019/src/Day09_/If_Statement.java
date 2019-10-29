package Day09_;

public class If_Statement 
{
	
	/*
	    if statement:
	        single if statement:
	           if ( boolean expression ){
	           		some code to run
	           }
	           if block only gets executed if the contion is true		
	 */
	
	public static void main(String[] args) 
	{
	
		if( true ) 
		{                       // it will print if the true
	     System.out.println("Hello");
	     System.out.println("Happy Friday");
		}
        
		int a = 1000;
        if ( a++ == 1000)   // if the condition is true will run the the code
        	  				// if is not nothing print.
        {								
        	System.out.println("a is increased " + a); 
        	
        }
        
        int x= 987654320;
        
        if ( x%2 == 0) 
        {
          System.out.println(x);
          System.out.println(" it's an ever number");
        }
        
        int Y = 2345678;
        if ( Y % 5 == 0 )
        { System.out.println( Y + " can be devided by 5"); }//statemant wrong 
        										//	so it will not print
        
        { System.out.println(Y + " cant be devided by 5"); }
        
        String CEO = "Main Boss";
        String Kuzzat = "Main Boss";
        
        if ( Kuzzat == CEO)    // so statement is true, it will print
        {	System.out.println("great Person in the World");
        }
        
        double TotalNumber = 100;
        boolean Cybertek = true;
        boolean BestSchool = true;
        
        if ( Cybertek == BestSchool) {
         //        true
         TotalNumber += 500;	// TotalNumber = 600;
        }
        if ( Cybertek  != BestSchool) {
        	// false
         TotalNumber -= 50; // TotalNumber = 50;	
         }
         System.out.println(TotalNumber);
         
         // 1. declare a variable, and initialize user age
         // 2. write a program if the user is eligible to vote. Vote age:18
         
         byte PersonAge = 78;
         byte voteAge = 18;
         
         if ( PersonAge >= voteAge ) {
        	 // true
         }
         System.out.println("Yes you are eligible to vote");
	     
         if ( PersonAge <= voteAge) {
        	 // false
         System.out.println("No you cant vote" );}	 
         
        
        
        
	}
}