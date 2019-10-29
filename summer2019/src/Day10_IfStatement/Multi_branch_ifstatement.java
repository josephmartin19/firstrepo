package Day10_IfStatement;

public class Multi_branch_ifstatement {
	
	public static void main(String[] args) {
		
		/*
		 if-else:
		 if(condition1){
		    //A ==> is condition is true
		 }
		 else if (condition2){
		    //B ==> if condition 1 false and condtion 2 is true
		 }
		 else {
		   //C   ==> if condition1 and condition2 are both false 
		 }
		 */
		
		if (false) {
			System.out.println("if block");
		}
		else if (true) {
			System.out.println("else if block");
		}
		else {
			System.out.println("else block");
		}
		// 90 <= grade ==> A
		// 80 <= grade < 90 ==> B
		// 70 <= grade < 80 ==> C
		// 60 <= grade < 70 ==> D
		//     else ==> F
		
		int grade = 85;
		
		if ( grade >= 90 ) {
			System.out.println("you have made A");
		}
		else if ( grade < 90 && grade >= 80) {
			System.out.println("You made B");
		}
		else if ( grade < 80 && grade >= 70) {
			System.out.println("You made C");
		}
		else if ( grade < 70 && grade >= 60) {
			System.out.println("You made D");
		}
		else {
			System.out.println("you made F");
		}
		/*
		  Task:
		  1. write a program that:
		         1. 0~12 ==> good morning
		         2. 12~15 ==> good afternoon
		         3. 15~23 ==> good night
		         4. 12 ==> good noon
		 */
		
		int hour = 12;
		if (hour >=0 && hour < 12) {
			System.out.println("Good morning ");
		}
		else if (hour >12 && hour <= 15) {
			System.out.println("Good afternoon");
		}
		else if (hour >15 && hour <=23 ) {
			System.out.println("Good nignt");
		}
		else {
			System.out.println("noon");
		}
	//  task: find bigger number
		
		int num1 =200, num2=300, num3 =50;
		
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1+ " is the bigger number");
		}
		else if ( num2 > num1 && num2 > num3) {
			System.out.println(num2+ " is the bigger number");
		}
		else if ( num3 > num2 && num3 > num1) {
			System.out.println(num3+ " is the bigger number");
		}
		else if ( num3==num2 && num3 > num2) {
			System.out.println(num3+ " and "+ num2 + " are the bigger number");
		}
		
	
	}

}
