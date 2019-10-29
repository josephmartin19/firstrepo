package Day40_statickeyWord;

public class staticKeyWord {
// ststic key word:means that we can access the nmebers through the class name.

	int a;
    static int b = 300;
    
	public static void main(String[] args) {

		staticKeyWord obj1 = new staticKeyWord();
		obj1.a = 100;

		staticKeyWord obj2 = new staticKeyWord();
		obj2.a = 200;

		System.out.println(obj1.a); // 100

		System.out.println(obj2.a); // 200
		
		obj1.b =900;
		
	    System.out.println(staticKeyWord.b); // 300
	    System.out.println(obj1.a);  //100
	    System.out.println(obj2.a);  //200
	    
	    System.out.println("=================================");
	    
	    staticKeyWord obj3 = new  staticKeyWord();
	         obj3.a = 100;
	         System.out.println( obj3.a);// 100
	         
	 	    
	     staticKeyWord obj4 = new  staticKeyWord();
	     System.out.println( obj4.a);   // 0
	     
	     
	    
	    
	    
	}

}
