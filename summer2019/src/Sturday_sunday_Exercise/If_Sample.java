package Sturday_sunday_Exercise;

import java.util.Scanner;

public class If_Sample {
	/*
	 * 
	 * A shop will give discount of 10% if the cost of purchased quantity is more
	 * than 1000. Ask user for quantity Suppose, one unit will cost 100. Judge and
	 * print total cost for user.
	 */

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);	
	
	System.out.println("how many item you purchase");
	int count = scan.nextInt();
	int cost = count * 100;
	
	if ( count > 1000) {
		System.out.println("your cost is "+ (cost * 0.90));
	} else {
		System.out.println("your cost is "+ cost);
	}
		System.out.println("==============================================");
	
	// A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
	// Ask user for their salary and year of service and print the net bonus amount.
	
	Scanner emp = new Scanner(System.in);
	
	System.out.println("how much is employee salary?");
	int salary = scan.nextInt();
	
	System.out.println("how many years of service?");
	int years = scan.nextInt();
	
	if (years > 5) {
		System.out.println("you will get "+ (salary * 1.05));
	} else {
		System.out.println("you will get "+ salary );
	}
	  System.out.println("============================================");
	  
	  
	  Scanner school =new Scanner(System.in);
	  System.out.println("what is your grade? ");
	  int grade = scan.nextInt();
	  
	  if (grade <= 25) {
		  System.out.println("your grade is " + "F");
	  }else if (grade>25 && grade<= 45) {
		  System.out.println("your grade is " + "E");
	  }else if ( grade >45 && grade <=50) {
		  System.out.println("your grade is " + "D");
	  }else 
		   System.out.println("you have pass the class"); 
	  
	  System.out.println("===========================================");
		   
	Scanner input = new Scanner(System.in);
	System.out.println("Enter all three people age");
	
	int age1 = scan.nextInt();  //20
	int age2 = scan.nextInt();  //30
	int age3 = scan.nextInt();  //40
	
	if ( age1>age2 && age2>age3) {
		System.out.println("oldest one is "+ age2);
	} else if (age1 > age2 && age1> age3) {
		System.out.println("oldest one is "+ age1);
	} else {
		System.out.println("oldest one is "+ age3);											
	}
		
		
	}

}
