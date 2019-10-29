package Day17_StringClass;

public class StringMethods {
	
	public static void main(String[] args) {
		
		
		
		String str1 ="Hello Javengers";
		String str2 = "Hello Javengers";	
		boolean R1 = str1==str2;
		System.out.println(R1);  // true
		
		String str3 = new String("public pool");
		String str4 = new String("public pool");
		boolean R2 = str3 ==str4; // false
		System.out.println(R2);
		
		boolean R3 = str1 == str3;  // false
		System.out.println(R3);
		
		System.out.println("===============================================");
		
		String a = "Cybertek";
		    a.concat(" School");   // "Cybertek School"
		    a = a.concat(" School");
		System.out.println(a);	
		
		String C ="Hello", D="hello";
		System.out.println(C == D);    // false , case sensitivity
		
		String LongName = "AKACJCODWCOJNDC";
		int num = LongName.length();
		System.out.println(num);
		
		String name2 ="cybertek";
		name2.toUpperCase();
		System.out.println(name2); // CYBERTEK
		
		name2 = name2.toUpperCase();
		System.out.println(name2);
		
		// trim(): its used gor removing the unused spaces.
		
			String s1 = "              hello";	
				  s1.trim();
			System.out.println(s1);	 // spaca still there when we print
			
			s1 = s1.trim();
			System.out.println(s1);System.out.println("==================");
			
			
			String s2 = "  cybertek School  ";
			  	  s2 = s2.trim();      // iki kelime arassi space i temizlemiyor
			 System.out.println(s2);   
			 
			 String s4 ="       Cybertek       School";
			        s4 = s4.trim();     // bastaki spaca siliyor aradaki space silmez
			        System.out.println(s4);
			
	// substring(begining index):
			        // its create sub value of the String
			        // return it as a new String value
			        
		String Str = "Cybertek School";
		           // 0123456789       S==> 5 karakterden sonra alir
		 Str = Str.substring(5,14);
		System.out.println(Str);
		
		String Name = "Hello Cybertek School";
				//	   0123456789...
		Name = Name.substring(6, 14); // 6 index icinde 14 dahil degil yani 6 dan 13 e kadri yazdirir.
		System.out.println(Name);
		
		String fullName = "cybertek Schooln Batch12";
		String middleName = fullName.substring(9,15);
			        
			        
			        
	}

}
