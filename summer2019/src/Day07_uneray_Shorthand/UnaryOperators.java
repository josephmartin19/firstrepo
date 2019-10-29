package Day07_uneray_Shorthand;

public class UnaryOperators {
	
	public static void main(String[] args) {
		/* 
		 
		 */
		
		int a = 10;
		int b = -10;
		System.out.println(b);
		
		int c = +b;
		System.out.println(c);
		
		int num1 = 100;    // pre increment: increase value by 1
		
		System.out.println(num1++); //100
		System.out.println(num1);   //101
		System.out.println(num1++);  //101
		System.out.println(num1);     //102
		System.out.println(num1--);  //102
		System.out.println(num1++);	//101
		System.out.println(num1++);	//102
		System.out.println(num1);	//103
		
		System.out.println(++num1); //104
		System.out.println(num1);   //104
		System.out.println(num1++);  //104
		System.out.println(num1);     //105
		System.out.println(--num1);  //104
		System.out.println(num1);	//104
		System.out.println(++num1);	//105
		System.out.println(num1);	//105
		
		int P = 50; //50
		P = --P + P++ + P-- + P++;
		//  49		49	50	49		
		System.out.println( P );	
		
		short Snum = 4;
		int R = Snum * 4 - Snum--;		
		//		16	-  4 = 12
		System.out.println(R);
		
		int W = 1;
			W= - W-- + W++ / -W-- * --W;
		//		-1	 + 0	-1	*  -1
			System.out.println(W);
			
		double x = 2;
			x= - x++ + x-- * --x +x++ / x--;
			//	-2	+  3 *  1  + 1  / 2
		System.out.println(x);
		
		}
	}
	


