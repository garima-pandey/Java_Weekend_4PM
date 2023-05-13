package OOPS;

class A {
	int x;
	 
	A() {
		System.out.println("Default Cons A");
	}
	
	A(int x) {
		this();
		this.x = x;
		System.out.println("Param Cons A "+x);
	}
}


class B extends A{
	int y;
	 
	B() {
		super(10);
		System.out.println("Default Cons B");
	}
	
	B(int y) {
		this();
		this.y = y;
		System.out.println("Param Cons B"+y);
	}
}


public class SupervsThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B(20);
	}
}
