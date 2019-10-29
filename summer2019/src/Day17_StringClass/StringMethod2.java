package Day17_StringClass;

public class StringMethod2 {
	
	public static void main(String[] args) {
	
		// replace ( old char, new char)
		
		
		String str1 = "java is fun Programing Lnaguage";
			str1 = str1.replace('a', 'e');  // butun a lari e ye degistirir.
			   System.out.println(str1);
		
		// replace(old str, new str):	   
		//       replace old str to new str value.
			   
			   
		String str2 ="Today is gonna be a great day to learn java";
		      str2 = str2.replace("Today", "Tomorrow"); // today terine tomorrow yaz demek..
		      System.out.println(str2);
			   
		// replaceFirst ( old str , new str)
		      
		      
		String s1 = "java is fun, Java is good";
		       s1 = s1.replaceFirst("java", "pyton"); // sadece ilk java yi pyton yapti.
		   System.out.println(s1); 
		   
		   String s2 = "Java is programing language, Java is Java";
		        s2 = s2.replace("Java", "C#");   // butun java lari C# ile degistir demek.
		        System.out.println(s2);
		   
		   
		      
		  
		   
		   
		   
	}

}
