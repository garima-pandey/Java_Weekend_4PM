package OOPS;

class Person { //parent class
	private String name;

	public Person() {
		//super();
		name = "John";
	}
	
	public void printName() {
		System.out.println("Name of the Person is: "+name);
	}
	
	public void contactNumber() {
		System.out.println("Person Contact Number");
	}
}

//extends - inheritance - reuseability
class _Student extends Person { //child class
	private int id;

	public _Student() {
		//super(); // call parent's class constructor
		id = 101;
	}
	
	public void printId() {
		System.out.println("Student is: "+id);
	}
	
	@Override
	public void contactNumber() {
		System.out.println("Student Contact Number");
	}
}

public class ISADemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_Student student = new _Student();
		student.printName();
		student.printId();
		student.contactNumber();
	}

}
