package StringHandling;

public class RemoveDupticatesString {
	
	public static String unique(String s) {
		
		String str = ""; // unique string, g, ga, gar, gare, garem
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i); // g, a, r, e, e, m, a
			
			if(str.indexOf(ch) < 0) { // -1 < 0, 3 < 0 - false, 1 < 0 - false
				str += ch; // str = str + ch; // "" + g, "g" + "a", "ga" + "r", "gar" + "e", "gare" + "m"
			}
		}
		
		return str;
	}
	

	public static void main(String[] args) {
		
		String input = "gareema";
		
		System.out.println(unique(input));

	}

}
