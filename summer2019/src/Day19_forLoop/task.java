package Day19_forLoop;

public class task {
	public static void main(String[] args) {
		
		
		
		// task 1:
		    for(int y = 1; y<=10 ; y++ ) {
		    	if (y % 2== 0) {
		    		
		    		System.out.print(y+ " ");
		    	}
		    }
		  System.out.println();
			for(int i = 1; i<=10 ; i++ ) {
				System.out.println("the square of "+ i +" is "+ (i*i));
		}
			
		//task 2:
			
			for (int i= 1; i<=32; i++) {
				if(i % 2 == 0) {
					System.out.print(i+ " ");
				}
			}
			
		// task 3: print all odd number
			  System.out.println();
			for (int i=1; i<= 32; i++) {
				if (i % 2 == 1) {
					System.out.print(i+ " ");
				}
			}
			
			
			String str = "java";
			//            0123
			//  "avaJ"
			String Rev =""+ str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
			
			String Rev2 ="";
			System.out.println();
			System.out.println(Rev);
			
		
			String Reversed ="";
			for (int i = str.length()-1 ; i >=0; i-- ) {
				Reversed += str.charAt(i);
			}
			System.out.println(Reversed);
			
			
			
			
			
	}

}
