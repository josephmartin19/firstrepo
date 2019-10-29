package Day42_Oop_Encapsulation;

public class Apple {
	
	public static void main(String[] args) {
		
	EmployeeInfo emrah = new EmployeeInfo();	
		emrah.setName("Emrah");
		System.out.println(emrah.getName());
		//  emrah.setSSN(0);
         System.out.println(emrah.getSSN()); 
		
		emrah.setAge((byte)40);
		
		System.out.println(emrah.getAge());
		
		emrah.setSalary(15000.00);
		System.out.println(emrah.getSalary());
		
		
	}

}
