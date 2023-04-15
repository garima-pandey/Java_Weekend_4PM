package OOPS;

public class Student {
	//Instance or Class Variables 
	int rollno;
	String name;
	String phone;
	String course;
	double fees;	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram = new Student();
		// ram: reference or address variable
		
		System.out.println("Roll no: "+ram.rollno);
		System.out.println("Name: "+ram.name);
		System.out.println("Phone: "+ram.phone);
		System.out.println("Course: "+ram.course);
		System.out.println("Fees: "+ram.fees);
	}
}
