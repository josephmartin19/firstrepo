package Day43_JavaRecap;

public class Test {
	
// Instance variables are also called fields. each objects has its own copies of instance variables
	//true
	
	//Qestions 
	
	static int a;
	  int b;
	  
	  public static void main(String[] args) {
		
		  Test  obj1 = new Test();
		     obj1.b = 10;
		     obj1.a =20;
		     
	     Test  obj2 = new Test();
	         obj2.b =30;
	         obj2.b =40;
		     
		System.out.println(obj1.b);   //10 
		System.out.println(obj2.b);   //0
		
		System.out.println(obj2.a);   //20 
		System.out.println(a);    //20
		System.out.println(obj2.a);  //20
		System.out.println(obj2.b); //40
		
	//Question	
		
		
	}
}
