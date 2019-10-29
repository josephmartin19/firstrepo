package Day17_StringClass;

import java.util.Scanner;

public class warmup {
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Entyer your first and last names");
	String firstName = scan.nextLine();
	String lastName = scan.nextLine();
	String fullName = firstName.concat(" "+lastName);
	int num = fullName.length();
	System.out.println(fullName+" contains "+ num + " characters");
	
	
		
		
		
		
	}

}
