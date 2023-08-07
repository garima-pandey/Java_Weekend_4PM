package OOPS;

public class FinalizeMethod {

	public static void main(String[] args) {
		
		//finalize: is used to perform clean up processing just before object is garbage collected.

		FinalizeMethod obj = new FinalizeMethod();
		obj = null;
		
		System.gc();
		System.out.println("Main Completes");
		
	}
	
	public void finalize() {
		System.out.println("Finalize method override");
	}

}
