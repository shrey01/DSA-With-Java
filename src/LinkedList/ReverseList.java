package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {

	public static void main(String[] args) {
		List<String> li = new ArrayList<>();

		li.add("Shreyakar");
		li.add("Ravi");
		li.add("Satyam");
		li.add("Prakash");
		li.add("Shany");
		List<String> li2 = new ArrayList<>();
		for (int i = li.size()-1; i >= 0; i--)
			li2.add(li.get(i));
		
		for (String string : li2) {
			System.out.println(string);
		}
	}

}
