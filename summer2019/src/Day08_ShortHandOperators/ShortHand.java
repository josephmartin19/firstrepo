package Day08_ShortHandOperators;

public class ShortHand {
	
	public static void main(String[] args) {
		/*
		  += : addition assignment    x+=y ==> x=x+y
		  -= : subtraction assigment  x-=y ==> x=x-y
		  *= : multiplication assigment x*=y ==> x=x*y
		  /= : division assigment     x/=y ==> x=x/y
		  %= : reminder assigment   x%=y  ==> x=x%y
		 */
		
		int a=9;
			a+=3; // a = a+3
		System.out.println(a);
		
		int b = a+= 5; 
		  //   12 +=5 ==>17
		System.out.println(b);
		
		int c = a += b; // a=34 b=17 c=34
		
		System.out.println(c);
		
		int d = a += c; // a=68 c=34  d= (a=a+c)=68
		System.out.println(d);
		
		int g = 101;
		int h = g -= 1;
		  //   101 -= 1 ==> 100
		System.out.println(h);
		
		int i = g+=h+5;
			//	100+=100+5 ==> 205
		System.out.println(i);		
		
		int j = h+= g % i;
		//     100 += 205 % 205
		//     100 += 0
		System.out.println(j);
		
		int k = j-= h * 2 % 5;
		  //  100 -= 200 %5
		  //  100 -= 0
		System.out.println(k);
		
		int A =100;
		A *= 200;  // A= A*200
		System.out.println(A);
		
		int B = 100;
		    B *= 100 /10;
		//  B *= 100 /10
		    System.out.println(B);
		    
		    B *= B - 1000;  //   B*= 1000 - 1000 =0
		    System.out.println(B);
		    
		    int C = 1000;
		        C /= 5;
		   System.out.println(C);  
		   
		   int D = 10;
		   C /=D+10;  //  200 /= 10+10
		   System.out.println(C);
		   
		   int z = 10%3;  // ==>  10/3 =3. ....
		   
		   int E = 10;
		   E %= 2;  // E = 10%2
		   System.out.println(E);
		   
		   int F = 100;
		       F %=2;
		    System.out.println(F);  
		    
		    int J = 300;
		    int K = 10;
		    
		    J += J %= K;
		    System.out.println(J);
	}

}
