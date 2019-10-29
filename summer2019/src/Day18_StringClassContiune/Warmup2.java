package Day18_StringClassContiune;

import java.util.Scanner;

public class Warmup2 {
	
	public static void main(String[] args) {
		
		// mUhtAr
		// CYberTeK     output: Muhtar Cybertek
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your first name");
		String firstName = scan.nextLine();
		// mUhtAr
		
		firstName = firstName.substring(0,1).toUpperCase()
				   + firstName.substring(1).toLowerCase();
		
		System.out.println(firstName);
		
		
		// charAt(index):
		
					//	System.out.println( str.charAt(8));
					
		               
		                String str = "Cybertek";
		           // 4rd character   01234567
						char ch = str.charAt(4);
						
						System.out.println(ch);
						
					String str2 ="Mu htar";
		// index numbers:         0123456	
					
					System.out.println( str2.charAt(2) );
		
		
				
		// compareTo()
					
		String word2 = "yusuf";   // y harfinin yeri ile n hafrinin yerini compare ediyor.
		String word3 = "nazli";
		System.out.println(word3.compareTo(word2));
		
		
		
	}
	

}
