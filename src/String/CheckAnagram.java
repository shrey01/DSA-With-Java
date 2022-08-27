package String;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String 1: ");
		String str1 = sc.nextLine();
		System.out.print("Enter the String 2: ");
		String str2 = sc.nextLine();

		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		boolean flag = true;
		if (c1.length != c2.length)
			flag = false;
		else {
			Arrays.sort(c1);
			Arrays.sort(c2);
			for (char x : c1) {
				for (char y : c2) {
					if (x == y)
						flag = true;
				}
			}
		}
		if (flag)
			System.out.println("The given string is anagram.");
		else
			System.out.println("The given string is not anagram.");

	}

}
