package Sturday_sunday_Exercise;

import java.util.Arrays;

public class Exercises {
	
	public static void main(String[] args) {
		
		int i=12; // use a program to print 12 to 1 with while.
		
		while(i>=1)
		{
			System.out.println(i);
			
			i--;
			
		}
		System.out.println("=======================================");
		
	//Question: about array
		
		int[] firstArray= {1,2,3,4,5,6}; // use while iteration to print the firstArray.
		
		int j=0;
		while(j<firstArray.length)
		{
			
			System.out.println("fistArray value of "+j+" "+firstArray[j]);
			
			j++;
		}
		    System.out.println("lenght of the array is "+ firstArray.length);
		    
		    System.out.println("==================================================");
		    
		       // use while iteration to print the month of the year
		    
		  //  String[] months={"jan","feb","mar","apr","may","june","jully","Aug","sep","oct","nov","dec"}; 
		  // bu sekilde de yazdirir.
		    String[] months= new String[] {"jan","feb","mar","apr","may","june","jully","Aug","sep","oct","nov","dec"};
		    int a=0;
		    
		    while(a< months.length)
		    {
		    	System.out.println(months[a]);
		    	a++;
		    	
		    	
		    }
		
		System.out.println("====================================================");
		
		int [][] myarray = { {2,7,9} , {3,6,1} , {7,4,2} };
		
		for (int x=0; x<3; x++)
		{
			for (int y=0; y<3; y++)
			{
				System.out.print(myarray [x][y]);
			}
		
		System.out.println();
	    }
		
		

		System.out.println("====================================================");
		
	
		
	}

}
