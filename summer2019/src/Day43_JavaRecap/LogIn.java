package Day43_JavaRecap;

public class LogIn {
	
	public static void main(String[] args) {
		
		Credentials obj = new Credentials();
	//	   obj.username = "Fatih"; instance variable username is private
	//	   obj.password = "12345"; instance variable username is private 
		
     obj.setUsername("yusuf");
     System.out.println(obj.getUsername());
		
     obj.setPassword("12334556");
     System.out.println(obj.getPassword());
		
		
		
	}

}
