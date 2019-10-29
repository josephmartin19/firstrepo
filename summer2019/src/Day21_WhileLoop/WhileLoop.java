package Day21_WhileLoop;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {

		/*
		 * while(condition){ statements; }
		 */
		int a = 9;
		while (a > 8) {
			System.out.println("Hello" + a);
			a--;
		}

		/*
		 * 1. write a java program that can count how many time the word "book" is
		 * appared in a String
		 */

		String sentence = "I like book, I read book, book book  book book";
		// "I like , I read book"
		// "I like , I read"

		int count = 0;// 1 + 1

		while (sentence.contains("book")) {
			count++;
			sentence = sentence.replaceFirst("book", "");
		}
		System.out.println(count);
		System.out.println(sentence);
		
		System.out.println("===============================");

		int i = 0;
		while (true) {
			i++;
			System.out.println("Hello: " + i); // hello 1
			if (i == 5) {
				break;

			}
        }
		   System.out.println("=================================");
		
		   // Use while loop to print even number. can divide to 5.
		   
		   int x = 1;
		   while ( x <=100) { 
	
			  if (x %5==0) {
				  
				  System.out.print(x+" ");
			  }
			  
			  x++; 
		   }
		   System.out.println();
		   System.out.println("==================================");
		   
		   Scanner scan = new Scanner(System.in);
		      System.out.println("Starting number");
		      int start = scan.nextInt(); // 10
		      
		      System.out.println("ending number");
		      int end = scan.nextInt();  // 100
		  
		      /*
		      for(int j = start ;  j <= end ; j++ ) {
		          if(j %2 == 0 ) {
		              System.out.print(j+" ");
		          }
		      }
		          */
		      
		      int j = start;
		      while(j <= end) {
		          if(j %2 == 0 ) {
		              System.out.print(j+" ");
		          }
		          j++ ;
		      }

		   
		
	}
}