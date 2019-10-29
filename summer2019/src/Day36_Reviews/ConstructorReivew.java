package Day36_Reviews;

public class ConstructorReivew {
	
	
	public ConstructorReivew() {  //construction name must have to match class name.
		
		System.out.println("Default constructor");
		
		}
	public ConstructorReivew(int a) {
		System.out.println("constructor with argument int:"+a);
	}
	
	
	public static void main(String[] args) {
		
		
		ConstructorReivew obj = new ConstructorReivew();
		
		ConstructorReivew obj2 = new ConstructorReivew(10);
		
	}

}
