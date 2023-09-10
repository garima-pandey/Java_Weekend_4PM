package ExceptionHandling;

public class ExceptionDemo {

	public static void main(String[] args) {

//		Exception: Abnormal condition which terminates the program flow or runtime error
//		Exception Handling
		
		System.out.println("DB connection open");
		System.out.println("DB Query");
		
		try {
			String str = null;
			str.toUpperCase(); // throw new NullPointerException();
			int arr[] = new int[10];
			arr[11] = 100; // throw new ArrayIndexOutOfBoundsException();
			int e = 10 / 0; // throw new ArithmeticException();
		}
		catch(ArithmeticException e) {
			System.err.println("You divide a number by zero "+e);
			return;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("More than Array Bound (Size)");
			return;
		}
		catch(NullPointerException e) {
			System.out.println("Value is null");
			return;
		}
		
		System.out.println("Get the Result of Query");
		System.out.println("Print the Result of the Query");
		System.out.println("DB connection close");
	}
}
