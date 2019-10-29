package Day14_Scanner;

public class Ternary {
	
	public static void main(String[] args) {
		
     int num = 0;
     if (true) {
    	 num = 100;
     } else {
    	 num = 50;
     }
     num=(true)?100:50;  // if is true assign 100 else 100
		System.out.println(num);
		
	// if( condition)     ==> (condition)?
	// else               ==>  :
	// else if(condition) ==>  : (condition)	
		
	int n = (false)	 ? 100 : 50;
	
	int y = false ? 100 :50;  // we dont have to use prantases
	
	System.out.println(num); // 50
	System.out.println(n);   // 50
	System.out.println(y);   // 50

	System.out.println("=======================================");
		
	String Schoolname = "";
	boolean Batch12 = true;
	
	if(Batch12) {
		Schoolname = "Cybertek";
	} else {
		Schoolname = "Invalid";
	}
	 System.out.println( Batch12 ? "Cybertek" : "Invalid" );
	 
	 // or we can write
	  
	 String BestSchool = Batch12 ? "Cybertek" : "Invalid" ;
	 System.out.println(BestSchool);
	 
	 System.out.println("=================================");
	 
	// double d = 10;
	// if(true) {
	//	 d= 10.5;
	// }
	 
	// double z =  true ? 10.5 : 0; // single if statement you cant  use tornary  
	
	double interestRate = 0;
	boolean GoodCredit = true;
	
	interestRate = GoodCredit == true ? 0.5 : 0.9 ;
	System.out.println(interestRate);
	
	byte grade = 60;
	boolean Passed = grade >= 60 ? true : false;
	System.out.println(Passed);
	
	char Finalgrade = 'A';
	String Group = "";
	
	if (Finalgrade == 'A') {
		Group = "Early bird";
		
	}else if(Finalgrade=='B') {
		Group = "Group 1";
	}else {
		Group = "After Group 1";
	}
	
	
	Group = ( Finalgrade == 'A') ? "Early bird" : (Finalgrade == 'B' )? "Group 1" : "AfterGroup 1";
	System.out.println(Group);
	
	int score =80;
	char Finals =' ';
	
	if(score >= 90 && score <=100)
			Finals ='A';
	else if(score >= 80 && score <= 89)
			Finals = 'B';
	else if(score >=70 && score <= 79)
			Finals = 'C';
	else if(score>= 60 && score <= 69)
			Finals ='D';
	else if(score>=0 && score <= 59)
			Finals = 'F';
	else
		Finals = ' ';
	
	Finals = ' ';
	
	Finals = (score >= 90 && score <=100) ? 'A'
			:(score >= 80 && score <= 89) ? 'B'
	        :(score >=70 && score <= 79) ? 'C'
	        :(score>= 60 && score <= 69) ? 'D'	
	        :(score>=0 && score <= 59)	? 'F'	
	        		: ' ';
	System.out.println(Finals);
	System.out.println("==============================================");
	
	int n1 = 100, n2= 300, n3= 400;
	
	int max = (n1 >n2 && n1 > n3) ? n1 : ( n2 > n1 && n2 >n3)? n2 : n3;
	 
	System.out.println(max);
	
	
	}

}
