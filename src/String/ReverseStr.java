package String;

import java.util.Scanner;

public class ReverseStr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Strng: ");
		String val = sc.next();
		char[] str = val.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = str.length-1; i >= 0; i--)
			sb.append(str[i]);
		System.out.println("Reverse: " + sb.toString());
	}

}
