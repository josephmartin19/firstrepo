package Day19_JavaPractice;

import java.util.Scanner;

public class String_Review2 {
	
	public static void main(String[] args) {
		
	// trim(): remove the unused spaces.
	String str = "        M       ";
	str = str.trim();
	System.out.println(str); // its take away all the spaces.
	
	String N1 = "   ";
	N1 = N1.trim();
	System.out.println( N1.isEmpty() );
	
	String N2 ="Tomorrow is gonna be  a great day to do repl.its";
    N2 =N2.trim();
    System.out.println(N2);	
    
    N2 = N2.replace(" ", "");
    System.out.println(N2); // tum bosluklari aldi..
    
    // charAt(index): returns a specific character from the String
    String C1 = "Cybertek";
   //            01234567
    char ch = C1.charAt(4); // what is the 4. character.
    System.out.println(ch); // "r"
    
    String C2 ="Please do more and more java practices tomorrow";
    int ch2 = C2.lastIndexOf("o");
    System.out.println(ch2);  // what is the number of last seen "o".
    
    char ch3 = C2.charAt( C2.lastIndexOf("o") +1 ); // it give us last "w"
    System.out.println(ch3);
    System.out.println("===========================================");
    
    String sentences = "Tomorrow we do not have class";
    System.out.println(sentences.charAt(0)); // what is the 0 character. "0".
    System.out.println(sentences.charAt( sentences.length()-1 )); 
    // sentences.length()-1. what is the character one before last? "s".
    System.out.println("==============================================");
    
   // startsWith & endsWith:  returns boolean, checks the starting and ending values.
    String Gmail ="cybertekSchool@gmail.com";
    boolean R = Gmail.endsWith("@gmail.com");
    System.out.println(R);
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your email Address");
    String GmailAddress = scan.nextLine().toLowerCase();
    
    if(GmailAddress.endsWith("@gmail.com")) {
        System.out.println("It's a valid gmail address ");
    } else {
        System.out.println("Invalid gmail address");
    }
 
 // starts with www.   and ends with .com
    System.out.println("Enter a web Address");
    String URL = scan.nextLine().toLowerCase();
    
    if(URL.startsWith("www.") && URL.endsWith(".com")) {
        System.out.println("it's a valid web address");
    } else {
        System.out.println("it's invalid web address");
    }
    System.out.println("==================================");
    
  // contains: checks if the given value is contained in
  //     the String or not then returns boolean.
    String Salary = "100$00";
    boolean result2 = Salary.contains("$");
    System.out.println(result2); // true
    System.out.println("===============================");
    
 // concat: concates two String values:
    String SchoolName ="Cybertek";
    SchoolName = SchoolName.concat(" School");  
    //"Cybertek School
    System.out.println(SchoolName);  // Cybertek School
    
    String schoolName2 ="Cybertek "+123;  
        // "+" concates any value to the String
    System.out.println(schoolName2); // Cybertek 123
    	
		
		
		
	}
}

