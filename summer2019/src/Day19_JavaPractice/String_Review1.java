package Day19_JavaPractice;

public class String_Review1 {
	
	public static void main(String[] args) {
	// subString: creating the sub value excludedof the String ending index is 	
		
	String str = "Cybertek School";
	str.substring(0, str.indexOf("k"));
	System.out.println(str);  // it will print "Cybertek School" because we did not assing str.
	
	str= str.substring(0, 8);
	System.out.println(str);  // "cybertek" or i can print
	
	str = str.substring(0,str.indexOf("k")+1);
	System.out.println(str);	
	// if i want to pring just school ==> 
	
	String str1 = "Cybertek School";
	str1 = str1.substring(str1.indexOf("S"));
	System.out.println(str1); // School
	
	// index of: returns the first occured value's index number
	String s1 = "Java is a fun language, I Love java, java,";
	System.out.println(s1.indexOf("a"));  // 1
	
	System.out.println("=======================================");
	// lastIndexOf(): returns the last occured char's index num
	System.out.println(s1.lastIndexOf("a")); // 39
	System.out.println(s1.lastIndexOf("ava")); //38  en son "ava" gordugu yer
	System.out.println(s1.indexOf("ava,"));  // 32 ilk "ava," gordugu yer
	
	System.out.println("=======================================");
	
	// replace: replaces all the occured old value with the new one
	String name = "Cybertek School Batch 12";
	int length = name.length();
	System.out.println(length);
	System.out.println("=======================================");
	
	// name = name.replace(" ", "");
	name = name.replace("e","a");
	System.out.println(name); // replace whenever you see to "e" with "a".
	name = name.replace("School", "family");
	System.out.println(name);	// replace School to family.
	System.out.println("=========================================");
	
	// replaceFirst: replaces the first occured old character with the new one.
	String A1 = "Java is Fun, Java is object oriented, Java is cool";
	A1 = A1.replaceFirst("Java is o", "C++ is o");
	System.out.println(A1); // replace first seen "java is o to "C++ is o"
	System.out.println("============================================");
	
	// == , equals, equalIgnoreCase
	String R1 = "Cybertek";				// String pool
	String R2 = new String("Cybertek"); // heap
	String R3 = new String("cybertek"); // heap
	
	System.out.println(R1 == R2);       // false, different location
    System.out.println(R1.equals(R2));  // true, visibile texts are same
    System.out.println(R1.equals(R3));  // false, case sensitivity
    System.out.println(R1.equalsIgnoreCase(R3)); // true, it checks the visible text without case sensitivity
	
		
	}
}
