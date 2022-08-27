package Arrays;

import java.util.HashMap;

public class RepeatingNum {

	static int[] array = { 1, 2, 4, 2, 1, 5, 6, 7, 45, 67, 89, 876, 5466 };

	public static void main(String[] args) {

		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int x : array)
			if (hm.containsKey(x))
				hm.put(x, hm.get(x) + 1);
			else
				hm.put(x, 1);

		for (int x : array)
			if (hm.containsKey(x) && !(hm.get(x) > 1))
				hm.remove(x);

		System.out.println(hm.toString());
	}
}
