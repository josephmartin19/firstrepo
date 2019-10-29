package Day15_Scanner_StringClass;

import java.util.Scanner;

public class StringInput {
	
	// next vs nextLine();
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name");
		    String firstname = scan.nextLine();  // next line da multiple
		    									// kelime yazabiliriz.
		System.out.println("Enter your last name"); 
		    String lastname = scan.next(); // next te ise 1 kelime yazilabilir.
		System.out.println("===========================================");
		
	// wrirte a program sum of 2 numbers.
		
		System.out.println("Enter the first number");
		     int n1 = scan.nextInt();
		System.out.println("Enter the second number");  
		     int n2 = scan.nextInt();
		     int total = n1 + n2;
		System.out.println("Total number is: " + total);  
		   
		
		
		
		
	}

}
