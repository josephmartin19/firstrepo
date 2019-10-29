package Day12_SwitchStatement;
import java.util.Scanner;
public class SwitchStatement {
	
public static void main(String[] args) {
	
	  Scanner scan = new Scanner(System.in);
	    System.out.println("Enter number");
	    
	    int month = scan.nextInt();
	switch (month) {
	  case 1: 
		  System.out.println("January");
	    break;
	  case 2:
	    System.out.println("February");
	    break;
	  case 3:
	    System.out.println("March");
	    break;
	  case 4:
	    System.out.println("April");
	    break;
	  case 5:
	    System.out.println("May");
	    break;
	  case 6:
	    System.out.println("June");
	    break;
	  case 7:
	    System.out.println("July");
	    break;
	  case 8:
	     System.out.println("Agust"); 
	    break;
	  case 9:
	     System.out.println("september");
	    break;
	  case 10:
	     System.out.println("October");
	     break;
	  case 11:
	     System.out.println("November");
	     break;
	  case 12:
	     System.out.println("December");
	  default:
			System.out.println("invalid");
			break;
	  }
	System.out.println("===============================");
	
	int score =1;
	
	switch (score) { // must give an Expression: date
	case 1:
		System.out.println("1");
		break;
		
	case 2:
		System.out.println("2");
		break;
			
	default:
		System.out.println("invalid");
		break;
	
		}
	
	String str = "Java";
	
	switch (str) {            // arada break olmassa hepsini yazdirir.
	  
	   case "c#":
		   System.out.println("C# programing Language");
		   break;
		   
	   case "Python":
		   System.out.println("paython is programing language");
		   break;
	   default:
		   System.out.println("invalid");
	
	}
	
	
	 
	   // break olmadigi icin hepsni yazdirir. case B yerine A olsaydi sadece B ve C yi yazdirirdi
	    //   arada break olsaydi ortadakini yazdiri birakirdi.
		
	
	 char cha='C';
		
		switch(cha) {//must give an expression:data
		
		
			
		case 'A':
			System.out.println("passed with A");
			                        // dogru nun altindaki tum seyi yazdirir ama break a kadar.
		case 'B':
			System.out.println("passed with B");
		
		case 'C':
			System.out.println("passed with C");
			break; 
			
		case 'D':
			System.out.println("passed with D");
			
		default:
			System.out.println("invalid");
			
			
			

		}
			}
	
}
	
	

	

