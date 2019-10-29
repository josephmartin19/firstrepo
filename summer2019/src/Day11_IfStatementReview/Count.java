package Day11_IfStatementReview;

public class Count {
	
	
 public static void main(String[] args) {
		    //do not change
 int count = 100;
 	    
		    //your code here
		    
 System.out.println("count");

		int Year = 2000;  //  leap
		boolean LeapYear = Year % 4 == 0;
		
		if(LeapYear) {
			
			System.out.println("Year "+Year+" is a leap year");
			
		} 
		else {
			
			System.out.println("Year "+Year+" is NOT a leap year");
		
		}
 
		int grade = 75;
		boolean A = grade >= 90 && grade <= 100;
		boolean B = grade >= 80 && grade <= 89;
		boolean C = grade >= 70 && grade <= 79;
		boolean D = grade >= 60 && grade <= 69;
		boolean ValidGrade = grade >=0 &&  grade <= 100;
	
	
		// in order to multi-brach if gets executed, first ValidGrade has to be true
	if(ValidGrade)	{
		if(A) {   //  100 >= grade >= 90
			System.out.println("You made A");
		}
		else if(B) {  //  90> grade >= 80
			System.out.println("You made B");
		}
		else if(C) { //  80> grade >= 70
			System.out.println("You made C");
		}
		else if(D) {  //  70> grade >= 60
			System.out.println("You made D");
		}
		else{  // 0 =< grade < 60  
			System.out.println("You made F");
		}
		
	}else  { // grade <0 || grade > 100
		System.out.println("Invalid grade");
		
		}
 
 
 



int age =30;
boolean GoodPerson = false;
	
if( age >= 18) 
{
	   System.out.println("you can buy milk");
	
	   if(GoodPerson) 
	   {
		   System.out.println("Alcohol is bad for your health");
	   }
	   else 
	   { // GoodPerson=false, && age >=18
		
		   System.out.println("You can buy Cigrates");
		
		   if(age>=21) 
		   {
			   System.out.println("You can buy Hookah");
		   }
		   
		   if(age >= 25) 
		   {
			   System.out.println("You can buy Alcohol");
		   }
	   



	   }

}
 }
}
   
 