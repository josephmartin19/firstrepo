package Day41_initializerBlocks;

public class Static_VsI_nstance_Vs_Constructor {
	
	static {
		System.out.println("static block"); // satic block execution does not depend on the object
	}								// executed as soon as class loaded, ONLY ONCE
	
	{
		System.out.println("instead block"); // instad block execution  depend on the object
	}                                   // when the object created instead block runs first.
	
	public Static_VsI_nstance_Vs_Constructor() {
		System.out.println("constructor");   // instad block execution  depend on the object
	}									// when object created, constructor runs after the instance block

	public static void main(String[] args) {
		
		Static_VsI_nstance_Vs_Constructor obj = new Static_VsI_nstance_Vs_Constructor();
		Static_VsI_nstance_Vs_Constructor obj2 = new Static_VsI_nstance_Vs_Constructor();
	}  // constructor and instance block' execution depends on the creation of object
	
}
