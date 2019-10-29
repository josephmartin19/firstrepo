package Day33_ArrayList;

import java.util.ArrayList;

public class ArrayListClass {
	
	 public static void main(String[] args) {
	        
		// declaration of arraylist:
		        ArrayList<String> list = new ArrayList<String>();
		        ArrayList<String> list2 = new ArrayList<>();
		        
		        
		        
		    // add(object):
		        ArrayList<String> shoppingList = new ArrayList<>();
		            shoppingList.add("apple");  // index: 0 ,  size: 1
		            shoppingList.add("orange"); //  index: 1,  size: 2
		            shoppingList.add("grape");  // index: 2,   size: 3
		        
		            System.out.println( shoppingList );   // [apple, orange, grape]
		        
		    // add(index, object): adds the object at the given index number
		                // WE CANNOT SKIP THE INDEXES
		            
		            //  shoppingList.add("Strawberry");
		             shoppingList.add(1, "Strawberry" );
		                System.out.println( shoppingList );   // [apple, Strawberry, orange, grape]
		              

		                
		        //  shoppingList.add(5 , "Toyota Corolla");  // it does not skip indexes
		            System.out.println( shoppingList );  //  [apple, Strawberry, orange, grape]   
		            
		            ArrayList<Integer> numbers = new ArrayList<Integer>();
		            numbers.add(0,  5);  // [5]
		            numbers.add(1,  10); // [5, 10]
		            numbers.add(2,  15); // [5, 10, 15]
		            
		            numbers.add(1,  1);   // [5, 1, 10, 15]
		            
		            numbers.add(1, 6);  //[5, 6, 1, 10, 15]
		            
		            System.out.println(numbers);     //  [5, 6, 1, 10, 15]
		    
		    //  get(index number): returns the object
		            ArrayList<String> names = new ArrayList<>();
		                names.add("Homayra");
		                names.add("Meri");
		                names.add(1, "Mikrigul");
		                names.add(1, "Tabriz");
		                names.add(0, "Asiya");
		                
		                String str1 = names.get(1); 
		                System.out.println( str1 );  // homayra
		                
		    // size():  =return the length of the arrayList as an Int value
		                
		                
		       int length = names.size();
		       System.out.println(length);  // 5
		       
		       for ( int i =0; i < names.size(); i++) {
		    	String each = names.get(i);
		    	System.out.print(each+" ");    // Asiya Homayra Tabriz Mikrigul Meri 
		       }
		       System.out.println();
		       
		       for ( String each : names) {
		    	   System.out.print(each+" ");  // Asiya Homayra Tabriz Mikrigul Meri 
		       }
		        System.out.println();
		   //  clear():
		       
		       ArrayList<String>students = new ArrayList<>();
		       
		 
			   students.add("Holly");
		       students.add("Erhan");
		       students.add("yusuf");
		       students.add("ali");
		       
		       System.out.print(students);   //[Holly, Erhan, yusuf, ali]
		       students.clear();
		       System.out.println();
		       System.out.println( students.size());// 0
		       
		       
		  // set(index number, object):   giving object will replace the object at the   
		       
		       
		      ArrayList<String> Javengers = new ArrayList<>();
		      
		      Javengers.add("ferthat");
		      Javengers.add("yusuf");  // replace yusuf with "ali"
		      Javengers.add("nazli"); 
		      Javengers.add("efe");
		      Javengers.add("eren");
		      
		      Javengers.set(1, "ali"); // replace index number 1(yusuf) to ali.
		      System.out.println(Javengers); //   [ferthat, ali, nazli, efe, eren]
		      Javengers.add(0, "kubra");  // index 0 ya kubrayi ekle...
		      System.out.println(Javengers);   //  [kubra, ferthat, ali, nazli, efe, eren] 
		      
		      
		  // contains (object):   check if the giving object contain in ArrayList or not and it return boolean value.
		      
		      ArrayList<String> goodGuys = new ArrayList<>();
		      
		      goodGuys.add("hakan");
		      goodGuys.add("haydar");
		      goodGuys.add("micheal");
		      goodGuys.add("necip");
		      goodGuys.add("osman");
		      
		     boolean result = goodGuys.contains("muhtar");
		      System.out.println(result);  // false   muhtar is not in the goodguys list.
		      
		   // equals (ArrayList): check is if the two Arraylist are equal or not.  
		      
		      ArrayList<String> badGuys = new ArrayList<>();
		      
		      badGuys.add("Muhtar");
		      badGuys.add("ali");
		      badGuys.add("serkan"); 
		      
		      boolean result2 = badGuys.equals(goodGuys);
		      System.out.println(result2);    // false
		      
		      if ( goodGuys.contains("osman") && badGuys.contains ("serkan") );
		      System.out.println();   //  false
		      
	 //      remove(int) : remove the giving index number
		      
		      ArrayList<Integer> lists = new ArrayList<>();
		      
		      lists.add(1);   //auto-boxing      index :0
		      lists.add(2);	  //auto-boxing      index :1
		      lists.add(3);   //auto-boxing      index :2
		      lists.add(4);   //auto-boxing      index :3
		      lists.add(5);   //auto-boxing      index :4
		      
		      lists.remove(1);  // [1,3,4,5]   1 index removed
		      lists.remove(2);  // [1,3,5]
		      lists.remove(1);  // [1,5 ]
		      System.out.println(lists); 
		      System.out.println(lists.size());   // size now is 2
		      
		      
		      ArrayList<Integer> lists2 = new ArrayList<>();
		      
		      lists2.add(1);   //auto-boxing      index :0
		      lists2.add(2);   //auto-boxing      index :1
		      lists2.add(3);   //auto-boxing      index :2
		      lists2.add(4);   //auto-boxing      index :3
		      lists2.add(5);   //auto-boxing      index :4
		      
		      // [1, 2, 3, 4, 5]
		      Integer a =1;
		  boolean r1  =  list2.remove(a);     // [ 2, 3, 4, 5]
		      
		      System.out.println(lists2);
		    
		      
		      ArrayList<String> city = new ArrayList<>();
		      
		      city.add("Miami");
		      city.add("Miami");
		      city.add("Istanbul");
		      city.add("Atlanta");   
		      city.add("Antalya");
		      
		  //    city.remove("Miami");  // [ Miami,Istanbul,Atlanta,Antalya]  remove first Miami
		      
		      if (city.remove("Miami")) {    // [ Miami,Istanbul,Atlanta,Antalya]  
		    	  city.remove(2);        // [ Miami,Istanbul,Antalya]  2.index removed.
		      }
		      System.out.println(city);
		      
		      
		      ArrayList<Integer> price = new ArrayList<>();
		      
		      price.add(1);  //auto-boxing
		      price.add(2);
		      price.add(3);
		      price.add(4);
		      price.add(5);
		      
		        price.remove( Integer.parseInt("2")) ;   // parse method rreturns primitve
		        System.out.println(price);   // [1, 2, 4, 5]  removed 2. index
		        
		        price.remove ( Integer.valueOf("3"));
		        System.out.println(price);
		       			       
			       
		      
		      
		    }
		    
		}


