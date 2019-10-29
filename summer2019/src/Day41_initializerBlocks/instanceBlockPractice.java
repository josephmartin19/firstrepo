package Day41_initializerBlocks;

public class instanceBlockPractice {
	
 public String name = "yusuf";
 
 public instanceBlockPractice(){
	 name = "Dennis";
 }
 
 {
	 name = "Nazli";
 }
 
 {
	name = "Hatice" ;
 }
 
 public instanceBlockPractice(int a) {
//	 name = "Muhtar";
 }
 
 public static void main(String[] args) {
	 
	 instanceBlockPractice obj = new instanceBlockPractice();
	    obj.name = "Java";
	 System.out.println(obj.name);  // yusuf
	 
	// instanceBlockPractice obj2 = new instanceBlockPractice();
	// System.out.println(obj.name);
}
}
