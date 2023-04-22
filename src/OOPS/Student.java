package OOPS;

public class Student {
	//Instance or Class Variables 
	//private member variables or Data Security
	private int rollno;
	private String name;
	private String phone;
	private String course;
	private double fees;
	private String collegeName;
	
	
	//Getter and Setter
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
//	int r, String n, String p, String c, double f - local variables
//	public void takeInput(int r, String n, String p, String c, double f) {
//	public void takeInput(int rollno, String name, String phone, String course, double fees) {
////		rollno = r;
////		name = n;
////		phone = p;
////		course = c;
////		fees = f;
//		
//		//instance variable = local variable
//		this.rollno = rollno;
//		this.name = name;
//		this.phone = phone;
//		this.course = course;
//		this.fees = fees;
//	}
//	
	
	//Default Consturctor
	Student() {
		collegeName = "SRCC";
	}

	//	Parameterized Consturctor
	Student(int rollno, String name, String phone, String course, double fees) {
		this(); // default constructor call
		
		this.rollno = rollno;
		this.name = name;
		this.phone = phone;
		this.course = course;
		this.fees = fees;
	}
	
	public void print() {
		System.out.println("Roll no: "+this.rollno);
		System.out.println("Name: "+name);
		System.out.println("Phone: "+phone);
		System.out.println("Course: "+course);
		System.out.println("Fees: "+fees);
		System.out.println("College Name: "+collegeName);
	}

	public static void main(String[] args) {
		//Default Constructor Call
//		Student ram = new Student();
		
		//Parameterized Constructor Call
		Student ram = new Student(101, "Ram", "9872638383", "Btech", 10000.0);
		// ram: reference or address variable
		ram.print();
		System.out.println("******************");
		ram.setPhone("8898765678");
//		System.out.println(ram.getPhone());
		ram.print();
		
//		ram.takeInput(101, "Ram", "9872638383", "Btech", 10000.0);
//		System.out.println("*********************");
//		ram.print();
		
//		System.out.println("Roll no: "+ram.rollno);
//		System.out.println("Name: "+ram.name);
//		System.out.println("Phone: "+ram.phone);
//		System.out.println("Course: "+ram.course);
//		System.out.println("Fees: "+ram.fees);
		
//		ram.rollno = 101;
//		ram.name = "Ram";
//		ram.phone = "9872638383";
//		ram.course = "Btech";
//		ram.fees = 10000.0;
		
		
//		System.out.println("Roll no: "+ram.rollno);
//		System.out.println("Name: "+ram.name);
//		System.out.println("Phone: "+ram.phone);
//		System.out.println("Course: "+ram.course);
//		System.out.println("Fees: "+ram.fees);
	}
}
