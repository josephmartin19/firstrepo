package Day15_Scanner_StringClass;

import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String[] args) {
		
		
		
		 Scanner scan = new Scanner(System.in);
		    System.out.println("Enter status code:");
		    
		    //WRITE YOUR CODE HERE 
		    
		    int statusCode = scan.nextInt();
		    
		    
		    
		    switch (statusCode) {
		  case 200:
		    System.out.println("OK");
		    break;
		   case 201:
		    System.out.println("Created");
		    break; 
		    case 202:
		    System.out.println("Accepted");  
		    break;
		    case 301:
		    System.out.println("Moved Permanently"); 
		    break;
		    case 303:
		    System.out.println("see Other"); 
		    break;
		    case 304:
		    System.out.println("Not Modified");
		    break;
		    case 307:
		    System.out.println("Temporary redirect");
		    break;
		    case 400:
		    System.out.println("Bad Request"); 
		    break;
		    case 401:
		    System.out.println("Unauthorized"); 
		    break;
		    case 403:
		    System.out.println("Forbidden"); 
		    break;
		    case 404:
		    System.out.println("Not Found"); 
		    break;
		    case 410:
		    System.out.println("Gone"); 
		    break;
		    case 500:
		    System.out.println("Internal Server Eror");  
		    break;
		    case 503:
		    System.out.println("Service unavaliable");  
		    default:
		    System.out.println("Invalid status code!"); 
		      
		
		    }
		
	}
	
	

}
