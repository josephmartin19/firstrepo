package Day31_JavaReview;

import java.util.Arrays;

public class ArrayReveiws {
	
	/*  Array: store multible data to a variable
	 * 
	 */
	
	
	
	public static void main(String[] args) {
		
		int num = 10;
		
	// declaration of array:
		int[]arr = {10 };  // array size of 1
		
	// initializing the array's size:
	  int [] arr2 = new int[2];  // [0,0]
		
	  String[] cars = new String[5];  // this array can contain 5 string values
      //  { Tesla, Audi,  Toyota, Jeep, Subaru }
      
      cars[4] = "Subaru";
      cars[2] = "Toyota";
      cars[1] = "Audi";
      cars[3] = "Jeep";
      cars[0] = "Tesla";    
      
      
      
      cars = new String[10];
      
//{ Tesla, Audi,  Toyota, Jeep, Subaru, "Ford", "Honda", "BMW", "Volvo", "Volkswagen"} 
      
      cars[5] = "Ford";
      
      for(int i = 0; i <= cars.length-1 ; i++ ) {
          System.out.print( cars[i]+" " );
      }
      System.out.println();
		
	  
	  boolean []bool = { 10>9, "Yusuf".equals("Seyfo"), 10==10 };
	  boolean b1 = bool[0];
	  System.out.println(b1);   // true  10>9 degeri oldugu icin boolean array true or false yazdirir.
	  // Arrays.toString ( arrayVariable ): convert 1D aaray to String,
	  
	  System.out.println(bool);  // hashcode if you print it
	  String str = Arrays.toString(bool);
	  System.out.println(str);       // [true, false, true]
	  
	  // Arrays.sort(): sort the arrasy in ascending order
	  
	  double [] dArray = { 1000,900, 800,700,600 };
	  System.out.println(Arrays.toString(dArray));    // [1000.0, 900.0, 800.0, 700.0, 600.0]
	  
	  Arrays.sort(dArray );
	  System.out.println(Arrays.toString(dArray));   // [600.0, 700.0, 800.0, 900.0, 1000.0]
	  
	  // print each array to desending order.
	  int [] number = {200,300,20,7890,40,-9,-100}; 
	  
	  Arrays.sort(number);
	  System.out.println(Arrays.toString(number));    //[-100, -9, 20, 40, 200, 300, 7890]
	  
      String result ="";
	  for ( int i = number.length -1; i >=0; i--) {
	   result += number[i] + ", " ;             //  7890,300,200,40,20,-9,-100,
	   }
	  
	  //  result = result.trim();
      // result =  result.replace("-100,", "-100");
      result = result.substring(0, result.lastIndexOf(",") );
      System.out.println(result);    // 7890,300,200,40,20,-9,-100
      
	  
	  
	}

}
