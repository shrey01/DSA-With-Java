package String;

import java.util.HashMap;

public class Oops {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 =  new String("Hello");
		String s4 =  s1.intern();
		String s5 =  new String("Hello");
		String s6 =  new String("Sir");
		System.out.println(s1.equals(s2)); //Value compaire  - true
		System.out.println(s1.equals(s3)); //Value compaire  - true
		System.out.println(s1 == s2); // address compaire  - true
		System.out.println(s1 == s3); // address compaire  - false
		System.out.println(s1 == s4); //  intern String address compaire - true
		System.out.println(s4 == s3); //  intern String address compaire  - false
		System.out.println(s3 == s5); //  String Object address compaire  - false
		System.out.println(s3.equals(s5)); //  String Object value compaire  - true
		System.out.println(s3.hashCode() == s5.hashCode()); //  String hashcode compaire  - true
		System.out.println(s3.hashCode() == s6.hashCode()); //  String hashcode compaire  - false
		
		HashMap<String,String> hm = new HashMap<>();
		hm.put(s3, s3+"1");
		hm.put(s5, s5+"2");
		hm.put(s6, s6);
		System.out.println(hm); // because hashcode is same for s3 and s5
		
		
	}

}
