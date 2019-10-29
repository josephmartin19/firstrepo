package Day30_WrapperClass_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListpractices {

	public static void main(String[] args) {

		ArrayList<String> nameList = new ArrayList<>();

		// add method:
		nameList.add("yusuf");
		nameList.add("apple");
		System.out.println(nameList);

		// create an ArrayList called studentsNames
		// create a scanner object called scan
		// then ask scanner to add more name if is yes add it if no exit from system.

		Scanner scan = new Scanner(System.in);
		ArrayList<String> studentName = new ArrayList<>();

		while (true) {
			
			System.out.println("Enter the name");
			String name = scan.nextLine();
			studentName.add(name);

			System.out.println("do you wnat to add anothre name");
			String answer = scan.nextLine().toLowerCase();
			
			if ( ! (answer.contentEquals("yes") || answer.contentEquals("no"))) {
				System.out.println("invalid");
			}
			
			if (answer.contentEquals("no")) {
				break;
			}

		}
          System.out.println(studentName);
	}
}