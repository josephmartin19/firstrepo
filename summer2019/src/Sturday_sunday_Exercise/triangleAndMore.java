package Sturday_sunday_Exercise;

public class triangleAndMore {
	
	public static void main(String[] args) {
		
      for(int i=1;i<=7;i++) {
	    	
	    	for(int j=7;j>=i;j--){ 
	    	
			System.out.print(" ");
			}
	    	
		for(int j=1;j<=i;j++) {
			
			System.out.print("* ");
		}
	
            System.out.println();
         }

System.out.println("============================");

   for (int x= 0; x <5; x++ ) {
	   
	   for (int y=0; y<5; y-- ) {
		   
	   }
	   System.out.println("* * * * *");
   }
	System.out.println("====================");	
	
	for (int k = 1; k <= 5; k++) {

		for (int j = 1; j <= k; j++) {

			System.out.print("*");
		}

		System.out.println();
	}
		
		
	}

}