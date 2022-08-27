package BinarySearch;

import java.util.Scanner;

public class BinarySearch {

	static int[] array = { 2, 4, 5, 6, 7, 45, 67, 89, 876, 5466 };

	public static void main(String[] args) {

		System.out.print("Enter element needs to be searched in sorted array: ");
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.next());
		int start = 0;
		int end = array.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (array[mid] == x) {
				System.out.println("Eleemnt " + x + " found at : " + mid);
				break;
			} else if (array[mid] < x)
				start = mid + 1;
			else
				end = mid - 1;
		}
	}
}
