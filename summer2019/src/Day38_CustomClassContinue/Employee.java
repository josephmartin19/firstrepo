package Day38_CustomClassContinue;

public class Employee {
	
	String Name;
	String ID;
	int age;
	int SSN;
	String JobTitle;
	double salary;
	
	public Employee (String Name, String ID, int age, int SSN, String JobTitle, double salary ) {
		
		this.Name = Name;
		this.ID = ID;
		this.age = age;
		this.SSN = SSN;
		this.JobTitle = JobTitle;
		this.salary = salary;
	}
	
	
	
	public void getInfo() {
		
		System.out.println("Employee' name is: "+Name);
		System.out.println("social Security Number is: "+SSN);
		System.out.println("age is: "+age);
		System.out.println("Job title: "+JobTitle);
	    System.out.println("Employee ID is:"+ID);
	    System.out.println("Salary"+salary);
	}

}
