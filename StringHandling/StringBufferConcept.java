package StringHandling;

public class StringBufferConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity()+ " "+ sb.length());
		sb.append("Hello"); // 5
		System.out.println(sb.capacity()+ " "+ sb.length());
		sb.append("How are you I am finecnoaihuiahouiwhoqih"); // 11 // 21 
		System.out.println(sb.capacity()+ " "+ sb.length());
		sb.append("Java");
		System.out.println(sb.capacity()+ " "+ sb.length());
		
//		capacity cross:
//			old cap * 2 + 2
//			16 * 2 + 2 = 34
			

	}

}
