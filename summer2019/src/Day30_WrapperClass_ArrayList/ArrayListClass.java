package Day30_WrapperClass_ArrayList;

import java.util.ArrayList;

public class ArrayListClass {

	 public static void main(String[] args) {
	        
	        /*
	         Declaration of arrayList:
	                ArrayList<ClassType> variableName = new ArrayList<>();
	                
	                ArrayList<ClassType>  variableName = new ArrayList<ClassType>();
	         */
	        
	            ArrayList<Integer>  list = new ArrayList<>();
	            
	            ArrayList<Integer>  list2 = new ArrayList<Integer>();
	            
	            			list2.add(10);  // to add value to array
	            			list2.add(20);
	            			list2.add(30);
	            System.out.println(list2);
	            System.out.println(list2.get(1));   // to get of 1 index number of array
	            
	            System.out.println(list2.size());    // lenhgt of list2 array whic is  3.
	            
	            list2.clear();
	            System.out.println(list2); // make it empty
	            
	            System.out.println(list2.size());  // ter we made empty size of array 0(zero)
	              
	        
	    }
	        
	    
	    
	}