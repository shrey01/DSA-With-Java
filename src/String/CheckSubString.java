package String;

import java.io.BufferedReader;
import java.util.Scanner;

public class CheckSubString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String val = sc.nextLine();
		System.out.print("Enter the SubString: ");
		String subVal = sc.nextLine();
		if(val.contains(subVal))
			System.out.println("SubString found");
		else
			System.out.println("SubString not found");
			
	}
}
