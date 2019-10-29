package Day08_ShortHandOperators;

public class warmup {
	/*
	  Task2 ; write java program gallon to litters
	          write java program convert litters to gallons
	                  1 gallon = 3.785 litters
	 */

	public static void main(String[] args) {
		
		int gallon = 100;
		double liters = gallon * 3.785;
		
		System.out.println(gallon +" gallons equal to " +liters+ " liters");
		
		double L = 1;
		double G = L / 3.785;
		
		System.out.println(L +" litters equal to " +G + " gallons" );
		
		int x = 2;
		int y = x++;
		
		System.out.println(y+" "+x);
	}
}
