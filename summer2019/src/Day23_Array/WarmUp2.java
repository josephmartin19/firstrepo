package Day23_Array;

public class WarmUp2 {

	public static void main(String[] args) {

		/*
		 * 2. write a program that can find the unique characters from a String. Ex:
		 * input: AAABCDEEFF output: BCD
		 * 
		 */

		String str = "aaaaabcccccddddeefgkl";     
		String Unique = "";

		

		for (int i = 0; i < str.length(); i++) {
			if (! Unique.contains(str.substring(i, i + 1))) {
				Unique += str.substring(i, i + 1);
			}
		}

		System.out.println(Unique);    // unique ones : abcdefgkl
		
		
		// write a code to revser String = " yusuf demirelli"
		
		
		String name = " yusuf demirelli ";
		String reverse = "";
		
		for ( int i = name.length()-1; i >=0; i--) {
			reverse += name.charAt(i);
		}
         System.out.println(reverse);
         
	}
}
