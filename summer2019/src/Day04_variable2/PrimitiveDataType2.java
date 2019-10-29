package Day04_variable2;

public class PrimitiveDataType2 {
	
	public static void main(String[] args) {
		
		boolean result = true;
		boolean result2 = false;
		boolean result3 = 9 > 3;
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		
		char char1 = 97;
		System.out.println(char1);	
		
		char char5 = 'C';   // it give us C. if i assign int then it tell us what is C in char
		System.out.println(char5);

		int d = char5;
		System.out.println(d);
		
		char char6 = '{';  // bu sekilde yazdirirsak sadece { bu degeri yazdirir.
		System.out.println(char6);
		
		char char7 = 123;
		System.out.println(char7);
		
		char mychar1 = 'b'; // b ni degeri direk cikmaz. mychar1 int e cevirip b nin degerini bulabiliriz
		int myint = mychar1;
		System.out.println(myint);
		
		double doubleNum = mychar1;
		double doubleNum2 = 'b';
		System.out.println(doubleNum2);
		
		
	}

}
