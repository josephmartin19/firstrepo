package Day37_classAndObject;

public class Dog {
	
	
	
	String Breed;
	String Size;
	byte Age;
	String color;
	String name;
	char Gender;
	String Food;
	
	public void getinfo() {
		System.out.println(Breed +" " + Size + " "+ Age +" years old,"+color+" Gender is "+Gender+ " name is "+name);
	}
	
	public void eat() {
		System.out.println(name + " is eating "+ Food);
	}
	
	public void play() {
		System.out.println(Breed+ " is playing ");
	}

}
