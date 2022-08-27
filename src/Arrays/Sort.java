package Arrays;

public class Sort {
	static int[] array = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

	public static void main(String[] args) {

		for (int i = 0; i < array.length; i++)
			for (int j = i; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}

		for (int i : array) {
			System.out.println(i);
		}
	}

}
