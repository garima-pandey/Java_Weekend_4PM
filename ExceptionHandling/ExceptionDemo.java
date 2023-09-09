package ExceptionHandling;

public class ExceptionDemo {

	public static void main(String[] args) {

//		Exception: Abnormal condition which terminates the program flow or runtime error
//		Exception Handling
		
		System.out.println("DB connection open");
		System.out.println("DB Query");
		
		try {
			int e = 10 / 0; // throw
		}
		catch(ArithmeticException e) {
			System.out.println("You divide a number by zero");
			return;
		}
		
		System.out.println("Get the Result of Query");
		System.out.println("Print the Result of the Query");
		System.out.println("DB connection close");
	}
}
