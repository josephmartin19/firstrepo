package Sturday_sunday_Exercise;

public class String_ClassMore {
	
	public static void main(String[] args) {
		
		
	// index Of
		
		String A1 = "cybertek is great school";
		int num = A1.indexOf("g");  // g kacinci harf tir
		System.out.println(num);
		
		int num2 = A1 .indexOf("eat")+2; // "eat" +2 kacinci karaktir.
		System.out.println(num2);
		
		String Address ="7925 Jones Branch Dr, Mclean, VA 22003";
		int end = Address.indexOf(", V");  // , ile baslayip V ile biten yerin idxi kactir.
		System.out.println(end);
		
		String email = "Random.Emails@gmail.com";
		int begin2 = email.indexOf("@")+1;  // bu bize g yi veri
		int end2 = email.indexOf(".com");   // bi da bize . verir

		System.out.println(email.substring(begin2,end2));
		
		/*
		 isEmpty():	checks if the String is empty
		 		retunrs boolean expressions	
		 		empty ==> true,  !empty ==> false
		 */
		
		String str = "Cybertek";
			boolean R1 = str.isEmpty();  // false
			System.out.println( R1 );  // false
			
			String str2 = "";
			if( str2.isEmpty() ) {
				// true
				System.out.println("it's empty String");
			} else {
				System.out.println("it's not empty");
			}
			
		
	/*
	 equals(str): checks if the two String' visible text are 
	 		equal or not, then returns boolean expression
	 		
	 		equal ==> true       !equal ==> false
	 		
	 		
	 */
			String B1 = "Cybertek";
			String B2 = new String("Cybertek");
			System.out.println(B1 ==  B2);  // false
			
				boolean R2 = A1.equals(B2);
				System.out.println(R2);
				
		System.out.println( "java".equals("Java")  ); 
				// false, case sensitivity
			
		/*
		 equalsIgnoreCase(str):checks if the two String' visible 
		 text are equal or not, then returns boolean expression
		 		Case sensitivity does not matter
		 
		 */
		
		String s1 = "JAVA";
		String s2 = new String("java");
		System.out.println( s1 == s2 ); // false, different location
		System.out.println( s1.equals(s2) );  // false, case sensitivity
		System.out.println( s1.equalsIgnoreCase(s2) ); // true
		
		
		/*
		 contains(str): checks if the str is contained in the String 
		 or not,  then returns boolean expression
		 
		 conatined ==> true       !conatined ==> false
		 		
		 */
		
		String name ="Muhtar";
			boolean Result = name.contains("ABC"); // false
		System.out.println( Result); // false
		
		String name2 ="Marufjon";
	System.out.println(name2.contains("m"));// false, case sensitivity
		
		
		/*
		 startsWith(str): checks if the String is started with 
		 	the given str or not, then return boolean expressions
		 
		 startedwith ==> true       !startedwith ==> false
		 
		 */
	
	String Today = "Java";
		boolean Result2 = Today.startsWith("J");  // true
		System.out.println(Result2);
	
		
String names = "Cybertek School is a great palce to learn java";
	
System.out.println(names.startsWith("Cybertek School"));  // true
	

	/*
	 endsWith(str): checks if the String is ended with 
	the given str or not, then retunrs boolean expressions
	
	endedwith ==> true        !endedwith ==> false
	 
	 */
		
			String C1 ="Muhtar";
			System.out.println( B1.endsWith("r") ); // true
			System.out.println(B1.endsWith("M"));   // false
		
		
	  String word = "bobcat";
	  String find1 = "b";    // b harfinin kacinci index oldugunu soyledi.
	  System.out.println(word.indexOf(find1));
	  
	  char find2 = 'c';
	  System.out.println(word.indexOf(find2));
		
	}

}
