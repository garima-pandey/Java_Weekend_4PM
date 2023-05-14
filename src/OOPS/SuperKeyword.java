package OOPS;

class _Person { //parent class
	private String name;

	public _Person() {
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

class Employee extends _Person {
	private String salary;
	
	public Employee() {
		salary = "50000";
	}
	
	public void printSalary() {
		System.out.println("Employee's Salary is: "+salary);
	}
	
	@Override
	public void contactNumber() {
		super.contactNumber(); // parent's contact number
		System.out.println("Employee Contact Number");
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		emp.printName();
		emp.printSalary();
		emp.contactNumber();
	}

}
