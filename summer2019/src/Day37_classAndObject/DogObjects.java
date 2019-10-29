package Day37_classAndObject;

public class DogObjects {
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		System.out.println(dog1.name);  // null
		
		dog1.Breed = "Husky";
		dog1.Size = "small";
		dog1.color = "gray and white";
		dog1.name = "Holly";
		dog1.Gender = 'F';
		dog1.Age = 25;
		
		System.out.println(dog1.Breed); // Husky
		
		dog1.getinfo(); // Husky small 25 years old,gray and white Gender is F name is Holly
		
		Dog dog2 = new Dog();
		dog2.Breed = "Pitbull";
		dog2.name = "lyka";
		dog2.color = "gray";
		dog2.Age = 3;
		dog2.Size = "large";
		dog2.Gender = 'M';
		dog2.Food = "Sushi";
		dog2.getinfo(); // Husky large 3 years old,gray Gender is M name is lyka
		
		dog2.eat(); //lyka is eating Sushi
		dog2.play(); // Pitbull is playing 
		dog1.play(); //Husky is playing 
		
		
		
	
	}

}
