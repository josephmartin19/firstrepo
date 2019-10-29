package Day20_;

public class Warmup {
	
	public static void main(String[] args) {
		
		
	String sentence = "Ilike book, I have book, I need book, I buy book";	
	
	
		int count = 0;
		for ( int z =0; z<sentence.length()-3; z++) {  // -3 cunki asagida z+4 oldugu icin
			
			
			if ( sentence.substring (z, z+4).equals("book") ) {
				count++;
			}
		}
		System.out.println(count);
		
		System.out.println("=================================================");
		
		String word = "Cybertek is school,Cybertek is great,I love cybertek";  // how many cybertek we have.
		// index :      i,   i+7
		// substring (i, i+7+1)  ending index is excluded in substring
		int nTimes=0;
		for( int i =0; i < word.length()-7; i++ ) {
			
		if (word.substring (i, i+8).equals("Cybertek") ) {
			nTimes++;
		}
			
		}
		System.out.println(nTimes);
		
		
		
		// write a java program that can remove duplicated values from String
	    //   EX:
	    //        input: aabbcc
	    //        output: abc
	    //
	    
	        String s1 = "aabbcc";
	        //           i
	        //  a:  (0, 1)  
	    //          (i, 1+1)
	        String result = "";  //abc  // to store the new String value that does not have duplicates
	        
	        for(int i=0; i < s1.length(); i++) {
	            if(! result.contains( s1.substring(i, i+1) )) {
	                //                          (5, 6) ==> c
	                result += s1.substring(i, i+1);
	            }
	        }
	        System.out.println(result);
	        
	 
	        
		
	}

}
