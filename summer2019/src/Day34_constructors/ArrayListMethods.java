package Day34_constructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {
	
	
    /*
    remaining methods:
            indexOf(), lastIndeOf()
            
            converting array to arrayList 
            
            removeAll(), addAll();
    
 */

public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
        list.add(  124  ); // auto boxing 
        list.add( Integer.valueOf("33") );  // none
        list.add( Integer.parseInt("100") ); // auto boxing
        list.add(232);
        list.add(674);
        list.add(1);
        
    // indexOf(object): returns the index number of the given object from the arrayList 
         // if it returns negative number, it means the given object is not exist in the arraylist
        
        int a = list.indexOf( 11 );  // auto boxing
        System.out.println( a );            // -1  cunki a is not exist in 11
    
    
             int a2 =  list.indexOf(200);
             System.out.println(a2);    // 3
             
             
       // lastindexOf(object):      
             
             int a3 =  list.indexOf(1);   
             
             int a4 =  list.indexOf(1);
             System.out.println(a3);    
             System.out.println(a4);   
             
       // converting array to arraylist
             
          Integer [] arr = {1,2,3,4,5} ;
          
          ArrayList<Integer> list2 = new ArrayList <> (Arrays.asList(arr));   //A
                  list2.add(100);
           System.out.println(list2);      // [1, 2, 3, 4, 5,100]
           
           String [] arr2 = { "java", "Python","C#", "C++" };
           ArrayList<String> list3 = new ArrayList<>(Arrays.asList(arr2) );
           
           System.out.println(list3);     //  [java, Python, C#, C++]
           System.out.println(list3.isEmpty());   // false 
           
           int [] arr3 = {1,2,3,4,5};
           
     //  ArrayList<Integer> list4 = new ArrayList <> (Arrays.asList(arr3));
           // only to object arrays can be converted.
           
           
       //  addAll(Interface): use for stoting multiable object to ArrayList    
             
           String[] allaNames = { "Hakan", "Alexis", "Rahwa", "Erhan", "Holy"};
           
           ArrayList<String> names = new ArrayList<>();
               names.addAll(  Arrays.asList( "Almaz" , "Ibrohim" , "Tabi" )  );
               
               names.addAll( Arrays.asList(allaNames) );
               System.out.println(names);
               
      // removeAll(Interface): removes all the matching objects.  
        //   ***     removed method dont use in the loop  ***
               
               ArrayList<Integer> numbers = new ArrayList<Integer>();
               numbers.addAll( Arrays.asList(1,1,1,1,2,2,2,3,3,3,3,4,4));
               
               numbers.removeAll( Arrays.asList(1)) ;
               System.out.println(numbers);      // [2, 2, 2, 3, 3, 3, 3, 4, 4]
               
      // arraylist sorting:
               Integer [] array = {1000,900,80,765,123,542} ;
               
               ArrayList<Integer> price = new ArrayList<> ();
               price.addAll(   Arrays.asList(array));
               
               System.out.println(price);    //  [1000, 900, 80, 765, 123, 542]
               
               Collections.sort( price);
               System.out.println(price);    //  [80, 123, 542, 765, 900, 1000]
               
               
}


}

