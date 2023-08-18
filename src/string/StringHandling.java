
public class StringHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String Literal Style: 0 or 1
		String name = "Rushil";
		String name2 = "Rushil";
		//String Object Style: 1 or 2
		String name3 = new String("Rushil");
		String name4 = new String("Rushil");
		System.out.println(name == name2);
		System.out.println(name3 == name4);
		
		String t = "Hello";
		String y = t; // 99
		System.out.println(y == t);
		t = t + "How are you"; // "Hello" + "How are you"; // 101
		System.out.println(y == t);
	}

}
