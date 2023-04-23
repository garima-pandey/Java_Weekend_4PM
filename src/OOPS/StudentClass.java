package OOPS;

public class StudentClass {
	private int id;
	private String name;
	private double fees;
	private String collegeName;
	
	//1
	public StudentClass() {
//		this(101, "Shyam", 10000.0);
//		this(101, "Shyam");
		collegeName = "SRCC";
	}

	//2
	public StudentClass(int id, String name, double fees) { //paramaters or formal arguments
		this(102, "Shyam Kumar");
//		this();
		this.id = id;
		this.name = name;
		this.fees = fees;
	}

	//3
	public StudentClass(int id, String name) {
		this();
		this.id = id;
		this.name = name;
	}

	public void print() {
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Fees: "+fees);
		System.out.println("College: "+collegeName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentClass shyam = new StudentClass(101, "Shyam", 10000.0); // actual arguments
		shyam.print();
	}

}
