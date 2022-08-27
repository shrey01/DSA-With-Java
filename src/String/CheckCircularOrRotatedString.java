package String;

import java.util.Scanner;

public class CheckCircularOrRotatedString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String1 : ");
		String str1 = sc.nextLine();
		System.out.println("Enter String2 : ");
		String str2 = sc.nextLine();
		// if length is not same then it is not circular string
		if (str1.length() != str2.length())
			System.out.println(str1 + " and " + str2 + " are not circlular string");
		else {
			String str3 = str1 + str1;
			if (str3.contains(str2))
				System.out.println(str1 + " and " + str2 + " are circlular string");
			else
				System.out.println(str1 + " and " + str2 + " are not circlular string");

		}

	}

}
