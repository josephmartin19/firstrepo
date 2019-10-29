package Day41_initializerBlocks;

import java.util.ArrayList;
import java.util.Arrays;

public class staticBlockPractice {

	public static String name; // "suna" , "Erhan", "mehmet"
	public static int[] arr1;
	public static ArrayList<String> list = new ArrayList<>();
	
	public static ArrayList<String> students = new ArrayList<>();
	public static String [] online = { "Ali","Veli", "Deli", "cemil" };
	public static String [] inClass = { "mehmet","hasan", "yusuf", "alp" };

	static {
		name = "Erhan";
		arr1 = new int[3]; // {0, 0, 0};
		arr1[1] = 2; // {0, 2, 0}

		list.add("Break");
		students.addAll ( Arrays.asList(online));  //[Ali, Veli, Deli, cemil]
		//students.addAll ( Arrays.asList(inClass));
	}

	static {
		name = "Suna";
		arr1 = new int[5]; // {0, 0, 0, 0, 0};
		arr1[0] = 1; // { 1, 0, 0,0,0}
		arr1[2] = 3; // { 1, 0, 3,0,0}

		list.add("Coffee");
		list.add("Tea");

	}

	public static void main(String[] args) {
		staticBlockPractice obj1 = new staticBlockPractice();

		System.out.println(name); // null

		System.out.println(Arrays.toString(arr1));

		System.out.println(list);
		
		System.out.println(students);
	

	}

	public staticBlockPractice() {
		name = "Mehmet";
	}
}
