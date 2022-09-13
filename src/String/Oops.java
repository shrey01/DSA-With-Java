package String;

public class Oops {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 =  new String("Hello");
		String s4 =  s1.intern();
		System.out.println(s1.equals(s2)); //Value compaire  - true
		System.out.println(s1.equals(s3)); //Value compaire  - true
		System.out.println(s1 == s2); // address compaire  - true
		System.out.println(s1 == s3); // address compaire  - false
		System.out.println(s1 == s4); //  intern String address compaire - true
		System.out.println(s4 == s3); //  intern String address compaire  - false
		
		
	}

}
