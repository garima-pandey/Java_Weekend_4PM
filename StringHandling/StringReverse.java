package StringHandling;

public class StringReverse {

	public static void main(String[] args) {
		
		String input = "Harpreet";
		
		//second approach
		char[] arrString = input.toCharArray();
		
		for(int i = arrString.length-1; i >= 0; i--) {
			System.out.print(arrString[i]);
		}
		
//		first approach
//		StringBuilder str = new StringBuilder();
//		
//		str.append(input);
//		
//		str.reverse();
//		
//		System.out.println(str);

	}

}
