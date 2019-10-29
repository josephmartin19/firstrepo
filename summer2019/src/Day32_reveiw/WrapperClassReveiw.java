package Day32_reveiw;

public class WrapperClassReveiw {
	
/*
	       primitive				Wrapper clases
	       byte							Byte
	       short	AUTO-BOXING			Short
	       int	  ================>>	Integer
	       long							Long
	       float	  UN-BOXIG			Float
	       double	<<=============		Double
	       boolean						Boolean
	       char							Char
	       
	       
	   1.  default values:
	       primatives :byte , short, int, long ==>> 0
	       float, double ==>> 0.0
	       boolean ==>>false
	       char ==>> space
	       
	       All Wrapper class: null
	       
	   2.   Wrapper class they only accept its own primative values
	   
	   3.Wrapper class has method, primative dont
	   
	   4.Wrapper class takes object, primative takes values.
	   
	   Methods: Max_Value, Min_Value, parse method, Value of method.
	   
	   Max_Value: Return max value of the data-type
	   Min_Value:  Return min value of the data-type
 * 
 */

	public static void main(String[] args) {
		
		int a = 10;
		Integer b= 10;  // Integer only accepts int primative value
		byte c = 20;
	//	Integer b2 = c;  // Integer only accepts int primative value
		
		
		boolean result = 9 >0+1;
		Boolean result2 = result;  // auto-boxing
		
		boolean result3 = result2; // un-boxing
		
		 Boolean result4 = result2;   // none
	        
	        boolean ressult5 = result3;  // none
	        
	        /*
	        methods:
	                max_value
	                min_value
	                parse methods
	                valueof methods
	                
	        */
	        
	        int max = Integer.MAX_VALUE;
//	      int max2 =  Double.MAX_VALUE; //  int != double
	        System.out.println(max -1);
	        
	        System.out.println( Double.MAX_VALUE ); 
	        System.out.println( Byte.MAX_VALUE );  // 127
	        
	        
	        byte min  = Byte.MIN_VALUE;  // -128
	        int min2 = Short.MIN_VALUE;  // 
	        System.out.println(min);
	        System.out.println(min2);
	        
	        
	        
	    //parse methods:    returns primitves, ignores the  the case sensitivity
	        short s1 = Short.parseShort("1234");
	        System.out.println(s1 +1 );
	        
	        double d1 = Double.parseDouble( "78.5"); //none
	        Double d2 = Double.parseDouble( "78.5"); //auto-boxing
	        
	        
	            boolean r1 = Boolean.parseBoolean("lunch") ; //none, 
	            System.out.println(  r1  );
	        
	    // ValueOf Method: Return wrapper class,
	            
	        Integer num = Integer.valueOf("123") ;   //non   
	        System.out.println(num);
	        
	        byte num3 = Byte.valueOf("123"); // un-boxing
	        
	        boolean R1 = Boolean.valueOf("123213");    // unboxing
	        System.out.println(R1);    
	    }
	
		
	}
	
	
	
	
	
	
	
	
	
	
	

	

