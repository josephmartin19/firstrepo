package Day37_classAndObject;

public class CarObject {
	
	public static void main(String[] args) {
		
		
		Car         car1    =     new       Car();
//   classname     objName		 keyword    constructor		
		
		car1.Brand = "BMW";
		car1.Color ="White";
		car1.Millage = 100000;
		car1.Model = "X6";
		car1.Price = 15000.5;
		car1.Year = 2000;
		
		System.out.println(car1.Brand);  //BMW
		System.out.println(car1.Color); 
		System.out.println(car1.Millage); 
		System.out.println(car1.Model); 
		System.out.println(car1.Price); 
		System.out.println(car1.Year); 
		
		System.out.println("=======================================");
		
		Car car2 = new Car();
		
		System.out.println(car2.Brand); // null
		
		car2.Brand = "Toyota";
		car2.Model = "corolla";
		car2.Color = "Black";
		car2.Millage = 150000;
	    car2.Year = 2002;
	    car2.Price =2000;
	    
	    System.out.println(car2.Brand);  // Toyota
	    System.out.println(car2.Model);  //coralla
		System.out.println(car2.Year);   // 2002
		System.out.println(car2.Millage);  // 150000
		System.out.println(car2.Color);  //Black
		System.out.println( car2.Price); //2000.0
		
		
		car1.drive();   // Driving BMW
		car2.drive();  // Driving Toyota
		
		car1.start(); // BMW is started 
		car2.start(); // Toyota is started 
		
		car2.getInfo();  // 2002 Toyota corolla, Black, 150000, $2000.0
		
		Car car3 = new Car();
		    car3.getInfo(); // default values
		     car3 .Brand = "lexus";
		     car3.Model = "RX350";
		     car3.Year = 2020;
		     car3.Millage = 25000;
		     car3.Color = "Purple";
		     car3.Price = 40000;
		     car3.getInfo();   //  2020 lexus RX350, Purple, 25000, $40000.0
		
	}

}
