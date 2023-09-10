package ExceptionHandling;

public class ExceptionConcept {
	
	static void db() throws ArithmeticException {
		System.out.println("Connection open");
		try {	
			int e = 10/0;
			System.out.println("Query and get result");
			System.out.println("Send result to helper");
		}
		// connection close need to print
		// finally is a block which always execute
		finally {			
			System.out.println("Connection close");
		}
	}
	
	static void helper() throws ArithmeticException {
		System.out.println("Call DB");
		db();
		System.out.println("Get result from DB");
		System.out.println("Send result to view");
	}
	
	static void view() {
		System.out.println("Call Helper");
		try {			
			helper();
		}
		catch(ArithmeticException e) {
			System.out.println("Divide a number by zero");
//			e.printStackTrace();
			return;
		}
		System.out.println("Get result from helper");
		System.out.println("Print result to User");
	}

	public static void main(String[] args) {
		
		view();

	}

}
