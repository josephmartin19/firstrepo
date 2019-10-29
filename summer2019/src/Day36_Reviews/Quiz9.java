package Day36_Reviews;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz9 {
	
	public static void main(String[] args) {
		
		
	// Q3:
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.addAll(Arrays.asList(1,2,3));
		
		int a = 1;
		list.remove(a);
		System.out.println(list);    // [1, 3]
		
	//	Q4:
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.addAll(Arrays.asList(1,2,3));
		
		Integer A = 1;
		list2.remove(A);
		System.out.println(list2);// [2, 3]
		
		//Q5:
		
		   // q5:
        String[] arr = {"Rob", "Bran", "Rick", "Bran"};
    ArrayList<String> names = new ArrayList<>( Arrays.asList(arr) );
    
    if(names.remove("Bran")) {  //[Rob, Rick, Bran] ,  true
        names.remove("John");  // false
    }
    
    
    System.out.println(names);  // [Rob, Rick, Bran]
        
		
	}

}
