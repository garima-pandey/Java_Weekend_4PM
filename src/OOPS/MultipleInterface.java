package OOPS;

//1. Multiple Inheritance
//2. Total abstraction

interface Print {
	void show(); // abstract methods
}

interface Display {
	void print(); // abstract methods
}

class Demo implements Print, Display {

	@Override
	public void print() {
		System.out.println("Print");
		
	}

	@Override
	public void show() {
		
		System.out.println("Show");
	}
	
}

public class MultipleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo obj = new Demo();
		obj.print();
		obj.show();
	}

}
