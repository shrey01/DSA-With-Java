package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class ListMultiplication {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		li.add(6);
		List<Integer> li2 = new ArrayList<>();
		li2.add(2);
		li2.add(3);
		li2.add(4);
		li2.add(5);
		li2.add(6);

		for (Integer x : li) {
			for (Integer y : li2) {
				System.out.println(x + " * " + y + " : " + x * y);
			}
		}

	}

}
