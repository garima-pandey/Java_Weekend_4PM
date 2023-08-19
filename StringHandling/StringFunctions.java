package StringHandling;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "  Java  ";
//		String gender = "Male";
		
		System.out.println(name.length());
//		System.out.println(gender.charAt(0));
		System.out.println(name.substring(1, 3)); // av
//		1 - index (0) = a
//		3 - position (1) = v
		
		System.out.println(name.trim());
		System.out.println(name.replace('v', 'w'));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.contains("Ja"));
		System.out.println(name + name.indexOf("v"));
		System.out.println(name.concat("Example"));
		System.out.println(name + " Example");
		System.out.println(name.indexOf("a"));
		System.out.println(name.lastIndexOf("a"));

	}

}
