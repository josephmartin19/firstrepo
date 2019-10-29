package A_selfStudy;
import java.util.*;
public class CustomClases {
	public static void main(String[] args) {
		ArrayList<String>myList = new ArrayList<>();
		myList.add("Moon");
		myList.add("Sun");
		myList.add("Mars");
		myList.add("Saturn");
		myList.add("Venus");	
		myList.add("Earth");
		myList.add("Plus");
		myList.add("Ploto");
		myList.add("Mercury");
		myList.add("Sun");
		
		String targetWord = "Sun";
		int count = countOccurance(myList,targetWord );
		if(count==2) {
			System.out.println("Unit Test passed. Count is 2.");
		}else {
			System.out.println("Unit test fail");
		}
	}
								// [aa,aa,bb.jj,zz]       aa
	
	
	public static int countOccurance(ArrayList<String>list,String word) {
	  int count = 0;
	  for(String str : list) {
		  if(str.contentEquals(word)) {
			  count++;
		  }
		  
	  }
		return count;
		
	}
}
