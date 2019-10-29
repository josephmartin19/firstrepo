package Day42_Oop_Encapsulation;

public class Test {
	
	
	public static void main(String[] args) {
		
	TestData obj = new TestData();
//	System.out.println(obj.Name);// data was private
		
	System.out.println(obj.getName());	
	
//	System.out.println(obj.ID);// private data
	
	System.out.println(obj.getID()); //897
	int a = obj.getID();
	
	// modify
	//     obj.Name = "Nurzat"  
	   obj.setName("Nurzat");
	// System.out.println(obj.Name);
	   obj.setName("nurzat");
	   System.out.println(obj.getName());  // nurzat
	   
	   obj.setID(400);
	   System.out.println(obj.getID());
	   
	   
	}	

}
