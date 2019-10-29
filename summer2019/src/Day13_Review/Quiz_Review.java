package Day13_Review;

public class Quiz_Review 
{
	
	public static void main(String[] args) 
	{
	
		
		int num =9;

		if(num++ == 10) 
		{  
       //  9 == 10 ==> false
		System.out.println("Hello World "+num);    
        }

		else 
		{

		System.out.println("Hello Universe "+num);  
		}
		
		// Question 2:
		
		int score=0;

		if(score == 0) 
		{   // 0 == 0 ==> true
		  score += 50;          // score =50;

		}

		else if(score !=0 ) 
		{

			score +=50;

		}

			System.out.println(score);
			
		// Qusetion 3:
		
		           
			   
			   for(int i=1;i<=5;i++) {
				   
			   
		 	   for (int j=1;j<=i;j++) {
		 		   
		 			   System.out.print("* ");
		 		   }
				   System.out.println();
				} 
				   for(int i=1;i<=5;i++) {
			 		   for (int j=5;j>=i;j--) {
			 		   
			 			   System.out.print("* ");
			 		   }
					   System.out.println();

	}
		
		
		
}

}
