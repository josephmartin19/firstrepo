package Day22_NestedLoop;

public class WarmUp2 {
	
	public static void main(String[] args) {
		
	
	
	String original="abcdefg";
	String Reverse="";
	
	for (int i=original.length()-1;  i>=0;   i--)  {
		Reverse+=original.substring(i,i+1);
	}
	System.out.println(Reverse);
	
	
//	String original="abcdefg";                we can do it also charAt....
//	String Reverse="";
	
//	for (int i=original.length()-1;i>=0;i--){
//		Reverse+=original.charAt(i);
//	}
//	System.out.println(Reverse);
	
	
}


}