package Day11_IfStatementReview;

public class Warmup4 {
	
	   /*
    1. write a program that can find the number of days in a month
       (Assume that Feb has 28 days)
       
       int month=0~12;
1     2    3    4      5    6     7       8    9    10    11    12
Jan,  Feb,  Mar,  Apr,  May,  Jun,  Jul,  Aug, Sep , Oct, Nov, Dec
31    28    31      30     31   30   31    31   30   31    30   31

           MUST use nested if
           
           28 days: 2
           30 days: 4,6, 9, 11
           31 days: 1,3,5,7,8,10,12
           
           even number of 30 days: 4 &6
           odd number of 30 days: 9 & 11
            
           even number of 31 days: 8, 10, 12
           odd number of 31 days: 1,3,5, 7
           
    */
       int month = 5 ;
       if( month >0 && month < 13) {
           if(month==1) {
               System.out.println("31 days ");
           }
           else if(month==2) {
               System.out.println("28 days");
           }
           else if(month==3){
               System.out.println("31 days");
           }
           else if(month == 4) {
               System.out.println("30 days");
           }
           else if( month ==5 ) {
               System.out.println("31 days");
           }
           else if(month == 6) {
               System.out.println("30 days");
           }
           else if(month ==7) {
               System.out.println("31 days");
           }
           else if(month %2 ==0 )  { 
           // months greater than 7, if it's even number ==> 31 days
               System.out.println("31 days");
           }  
           else if {
     // months greater than 7, if it's odd number ==> 30 days
               System.out.println("30 days");
           }
           
           
           
           
           
       
       else {
           System.out.println("Invalid Entry");
       }
       
       }
       
}
}
       



       
       
       
           
           
       
   


