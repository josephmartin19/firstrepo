package Day10_IfStatement;

public class SingleIfStatement {
	public static void main(String[] args) {
	
	int num1=100;
	int num2=300;
	int max = 0; // local variable initialized before
	
	if (num1 > num2) { // num1 greather than num2
		// flase
		max = num1;
	}
	
	if ( num2 > num1 ) {
		// true
		max = num2;  // max=300 
	}
		System.out.println("Max number is:" + num2);		
		
	if ( num1 == num2) {
		max = num2; }
		System.out.println("Both numbers are Equal");
		
	//	task02:
		int hours = 12;
		int minutes =45;
		int seconds = 30;
		
		String amOrPm = "am";
		
		System.out.println(hours + ":" +minutes + ":"+ seconds+ " "+ amOrPm);
		
	// task03:	
		
		int n1 =100, n2=500, n3=700;
		int maximum =0;
		
	//	 in order to n1 be the maximum :  n1 > n2 && n1 > n3
	//	 in order to n2 be the maximum :  n2 > n1 && n2 > n3
	//	 in order to n3 be the maximum :  n3 > n1 && n3 > n2
		
		
		
		if ( n1 > n2 && n1 > n3 ) {
			maximum = n1;
		}
		
		if(n2 > n1 && n2 > n3) {
			maximum = n2;
		}
		
		if(n3 > n1 && n3 > n2 ) {
			maximum = n3;
		}
		
		System.out.println(maximum); 
		
		
		
				// solution 2:
		if(n1 > n2 && n1 > n3) {
			System.out.println("Maximum number is " +n1);
		}
		
		if (n2>n1 && n2 > n3) {
			System.out.println("Maximum number is "+n2);
		}
		
		if(n3 > n1 && n3 > n2) {
			System.out.println("Maximum number is "+n3);
		}
		
		//Task 04  :
		int statusCode = 404;
		if( statusCode == 404);{
		
		String finalResult = "not found";
		
		
		System.out.println("status code "+ statusCode+ " is " + finalResult);
	   }
		
	}
	
}
