package Day40_statickeyWord;

public class staticVariable {
	
	static String name;
	static double staticNum;
	
	int num1;
	
	
	public static void main(String[] args) {
		
	//	System.out.println(num1);  complie eror stattic method only accepts class nmeber
		
		staticVariable objA = new staticVariable();
		System.out.println(objA.num1);   // 0
		
		staticVariable obj1 = new staticVariable();
		    obj1.name = "Omer";
		    System.out.println(obj1.name);  //omer
		    
		 staticVariable obj2 = new staticVariable();    // once we declare static variable  with new object
		 obj2.name = "yusuf";						    // rest will be the same en son atanan deger kalir.
		 System.out.println(obj2.name );   // yusuf
		 
		 staticVariable obj3 = new staticVariable(); 
		 obj3.name = "ali";
		 System.out.println(obj1.name); // ali
		 System.out.println(obj3.name); // ali
		 System.out.println("===========================================");
		 
		 staticVariable obj4 = new staticVariable(); 
		 obj1.name = "nazli";
		 obj2.name = "qqqq";
		 System.out.println(obj1.name);  // qqqq
		 System.out.println(obj3.name);  // qqqq
		 System.out.println(obj2.name);  // qqqq
		 //======================================
		 System.out.println(staticVariable.staticNum); //0.0
		 
		 staticVariable object1 = new staticVariable();
		      object1.staticNum =4.5;
		 System.out.println(object1.staticNum);    // 4.5
		 
		 
		 
		 
		 
		 
		 staticVariable object2 = new staticVariable();
		 System.out.println(object2.staticNum);     //4.5
		
	}
	

	

}
