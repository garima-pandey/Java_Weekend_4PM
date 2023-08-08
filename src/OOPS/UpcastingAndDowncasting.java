package OOPS;

class Parent {
	void display() {
		System.out.println("Parent");
	}
}

class Child extends Parent {
	void displayChild() {
		System.out.println("Child");
	}
}

public class UpcastingAndDowncasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a = Integer.parseInt(args[0]);
		
		Parent obj = new Child(); // Upcasting
		//Child obj1 = new Parent(); // Downcasting
		
		Parent p = new Child();
		Child c = (Child)p; // Downcasting
	}

}
