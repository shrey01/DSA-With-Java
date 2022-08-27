package MaxPossibleSumOfSubArray;

public class MaxSumSubArrayNTime {

	static int[] array = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

	public static void main(String[] args) {
		int sum = 0;
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			if (sum > max)
				max = sum;
			if (sum < 0)
				sum = 0;
		}
		System.out.println("Max possible Sub Array Sum : " + max);
	}

}
