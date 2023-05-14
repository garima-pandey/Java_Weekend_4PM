package OOPS;

class Base {
	public void finalMethod() {
		System.out.println("Base");
	}
}

class Derived extends Base {
	@Override
	public void finalMethod() {
		System.out.println("Derived");
	}
}

public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int SIDE = 20;
//		SIDE = 40;// error

		System.out.println(SIDE);
	}
}
