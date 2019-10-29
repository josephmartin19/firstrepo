package Day18_StringClassContiune;

import java.util.Scanner;

public class WarmUpClass {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first and last name");
		String firstName = input.nextLine();
		String lastName = input.nextLine();
		
		String initials = firstName.substring(0,1).concat(".")+lastName.substring(0,1);
		System.out.println(initials);
		
		System.out.println("======================================");
		
	
		
		
	}

}
