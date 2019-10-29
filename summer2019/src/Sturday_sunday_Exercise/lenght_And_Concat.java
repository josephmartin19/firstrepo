package Sturday_sunday_Exercise;

public class lenght_And_Concat {
	
	public static void main(String[] args) {
		
	String name = "JosepH mArtin";
	 int n = name.length();
	 System.out.println(n);
	 
	name= name.toUpperCase();
	System.out.println(name);
	
	name = name.toLowerCase();
	System.out.println(name);
	System.out.println("===============================");
	
	String a = "Batch 12 Javengers";
	int length = a.length();
	System.out.println(length);
	
	a= a.toLowerCase();	
	System.out.println(a);	
	
	// concat 
	
	String b = a.concat(" Awsome");  // String a degerine Awsome i yapistir.
	System.out.println(b);
	
	
	String c ="book";
	// System.out.println(c.toUpperCase());  veya
	c= c.toUpperCase();
	System.out.println(c);
	
	
	
	
	
		
	}

}
