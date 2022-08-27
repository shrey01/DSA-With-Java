package PrimeNum;

public class CheckPrime {

	static int[] array = { 0, 1, 2, 4, 5, 6, 7, 45, 67, 89, 876, 5466 };

	public static void main(String[] args) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0 || array[i] == 1) {
				System.out.println(array[i] + " is not prime number");
			} else {
				boolean prime = false;
				int mid = array[i] / 2;
				for (int j = 2; j <= mid; j++) {
					if (array[i] % j == 0)
						prime = true;
				}
				if (prime)
					System.out.println(array[i] + " is not prime number");
				else
					System.out.println(array[i] + " is prime number");
			}
		}
	}
}
