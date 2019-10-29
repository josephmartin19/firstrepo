package Day18_StringClassContiune;

public class StringClass_Contiune {

	public static void main(String[] args) {
		
		
		String A1 = "Batch 12 is a great batch";
		
		int num = A1.indexOf("g"); // it will print first g letter inclued space.
		System.out.println(num);
		
		int num2 = A1.indexOf("at");  // ilk "at" buldugu yeri gosterir. 
		System.out.println(num2);
		
		String B1 = "Today is Tuesday, today we have class in afternoon";
		
		int n1 = B1.indexOf("te");   // ilk te yi gordugu index i alir.
		System.out.println(n1);
		
		System.out.println("========================");
		
		String Address = " 7925 Jones Branch Dr, Mclearn, VA 22003";
		int begginindex = Address.indexOf(",")+1+1;  // , den sonraki +1 +1 index i alir yani " M " // 23.harf
		System.out.println(begginindex);
		
		String email = "josephusa@gamil.com";
		int begin2 = email.indexOf("@")+1;  // @ den bir sonraki yani g ile baslayan
		int end2 = email.indexOf(".com");   // .com indexi
		
		String emailType = email.substring(begin2 , end2);
		System.out.println(emailType);  
		
		//last index
		
		String str = "ABDKHFBKE";
		
		int n2 = str.indexOf("B");       //ilk B yi gordugu karakteri yazar.  1
		int n3 = str.lastIndexOf("B");  //en son gordugu B nin index ini yazdirir.   6
		
		System.out.println(n2);
		System.out.println(n3);
		
		

		
		
		
		
		
		
	}
}
