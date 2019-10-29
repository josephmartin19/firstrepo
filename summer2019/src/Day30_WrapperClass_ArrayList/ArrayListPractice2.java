package Day30_WrapperClass_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice2 {
	
	public static void main(String[] args) {
		
	ArrayList<Integer>	list = new ArrayList<>();
	
	// add to Array List all the even number till 40
	
	for (int i=0; i <= 40; i++) {
		if( i % 2 == 0)
		list.add(i);
	}
		
	System.out.println(list);  // print 0 to 40 even number
	System.out.println(list.size());  // 21 size off array
	
	  for ( int i =0; i < list.size(); i++) {    // to print out with for  loop 0 to 40 even number
		  System.out.print(list.get(i)+ " ");
	  }
	 System.out.println();
	 
	  for ( Integer each : list) {     // to print out with for each loop 0 to 40 even number
		  System.out.print(each+" ");
	  }
		System.out.println();
		
		int num = list.get(7);   // unboxing, there is no primative in Arraylist
		System.out.println(num);   // 7 array is 14
		
	//	list.clear();   // the size of list becomes 0
	//	System.out.println(list);    // it clear the list
		
		
  // SORTING ARRAYLIST:
		
		Collections.sort(list);
		System.out.println(list);  // sort the arryList
		
		ArrayList<Integer> list2 = new ArrayList<>();
		
		for ( int i =20; i >= 0; i--) {
			list2.add(i);
		}
	   System.out.println(list2);
	   
	   Collections.sort(list2);
	   System.out.println(list2);
	}
}
