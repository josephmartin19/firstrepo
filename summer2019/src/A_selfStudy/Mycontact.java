package A_selfStudy;

public class Mycontact {
	
	public static void main(String[] args) {
		
	Contact contact1 = new Contact();	
	
	contact1.name = "Joseph Martin";
	contact1.phoneNumber = "(404) 405-7212";
	contact1.email = "joseph@gmail.com";
	
	
	contact1.call(); // Calling Joseph Martin.........
	contact1.sendMessage();
	contact1.sendEmail(); // Sending email to joseph@gmail.com
	
	Contact joseph = new Contact();
	
	joseph.name = "joseph martin";
	joseph.phoneNumber = "(404)405-7212";
	joseph.email = "joseph@gmail.com";
	System.out.println("============================");
	System.out.println("Name: " + joseph.name);
	System.out.println("phoneNumber: " + joseph.phoneNumber);
		
	System.out.println("===========================");
	
	
	
	}


}
