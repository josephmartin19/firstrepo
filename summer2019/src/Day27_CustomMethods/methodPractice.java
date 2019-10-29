package Day27_CustomMethods;

public class methodPractice {
	
	// write a method that remove the duplicates
	
	 /*
    
    write a method that can remove duplicates from the string and prints out the 
          result
              
              Ex: RemoveDuplicates("aabbcccccddddaaa")
              output: abc
              
   */
  
  public static void main(String[] args) {
      /*
      String str ="abcabcabcDDDEEEFFFF";
      
      String result = "" ;  //"abc"
      for(int i=0; i < str.length(); i++) {
          if( ! result.contains( str.substring(i, i+1)) ) {
              result += str.substring(i, i+1);
          }
      }
      
      System.out.println(result);
      
          */
      
      
      
      RemoveDuplicates("carcarcarcar");  // abc
      RemoveDuplicates("aajjssnnddhhedds");     //ajsndhe
      RemoveDuplicates("aaaabbbbccccddd");    // abcd
      
  }
  
  
  public static void RemoveDuplicates (String b) {
      
      String result = "" ;           //"abc"
      for(int i=0; i < b.length(); i++) {
          if( ! result.contains( b.substring(i, i+1)) ) {
              result += b.substring(i, i+1);
          }
      }
      
      System.out.println(result);
      
  }
      
  
}