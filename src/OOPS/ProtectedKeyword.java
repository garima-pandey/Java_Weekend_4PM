package OOPS;

class Human { // parent class
	protected String name = "Garima Pandey";
}

class Teacher extends Human { // child class
	public void printName() {
		System.out.println(name);
	}
}

public class ProtectedKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher garima = new Teacher();
		garima.printName();
	}
}