package Sturday_sunday_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Rep_it {

	public static void main(String[] args) {

		int[] numbers = { 10, 20, 30, 40 };

		for (int eachValues : numbers) {

			if (eachValues == 20) {
				continue; // skips everysingle statements after the continue
			}

			System.out.print(eachValues + " ");

			break; // exits the loop immedietly
		}
		System.out.println();
// 	UNIQUE CHARACTER

		String s1 = "aabbcc";
		String result = "";
		for (int j = 0; j < s1.length(); j++) {
			if (!result.contains(s1.substring(j, j + 1))) {
				result += s1.substring(j, j + 1);
			}
		}
		System.out.println(result);

		System.out.println("=======================");

		String Address = " 7925 Jones Branch Dr, Mclearn, VA 22003";
		int begginindex = Address.indexOf(",") + 1 + 1; // , den sonraki +1 +1 index i alir yani " M " // 23.harf
		int ending = Address.indexOf("V") - 3;
		System.out.println(begginindex);
		System.out.println(ending);
		String name = Address.substring(begginindex, ending);
		System.out.println(name); // Mclear

		String email = "josephusa@gamil.com";
		int begin2 = email.indexOf("@") + 1; // @ den bir sonraki yani g ile baslayan
		int end2 = email.indexOf(".com"); // .com indexi

		String emailType = email.substring(begin2, end2);
		System.out.println(emailType);

		Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		int k = 0;
		words[k] = input.nextLine();

		
	}
}