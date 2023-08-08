package OOPS;

abstract class _Person_ {
	private String name;
	
	public _Person_(String name) {
		this.name = name;
	}
	
	public void printName() {
		System.out.println(name);
	}
	
	public abstract void contNumber();
}

class _Student_ extends _Person_ {
	private int id;
	
	public _Student_(int id) {
		super("Java");
		this.id = id;
	}
	
	public void printId() {
		System.out.println(id);
	}
	
	@Override
	public void contNumber() {
		System.out.println("Student's Contact Number");
	}
}

public class AbstractConcept {

	public static void main(String[] args) {
		
		// 1. Abstract class can have abstract methods
		// 2. Abstract methods are methods can only be declared, not defined.
		// 3. You cannot create objects of abstract class
		
		
		_Student_ student = new _Student_(100);
		student.printId();
		student.printName();
		student.contNumber();
		
//		_Person_ person = new _Person_();// error

	}

}
