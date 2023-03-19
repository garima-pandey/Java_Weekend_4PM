package Basics;
import java.util.Scanner;

public class ScannerConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		System.out.println("Your name is: "+name);
		
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();
		System.out.println("Your age is: "+age);

		System.out.println("Enter your contact: ");
		long mobileNo = scanner.nextLong();
		System.out.println("Your Contact is: "+mobileNo);
		
		System.out.println("Enter your CGPA: ");
		double cgpa = scanner.nextDouble();
		System.out.println("Your CGPA is: "+cgpa);
		
		System.out.println("Enter your gender: ");
		char gender = scanner.next().charAt(0); 
		System.out.println("Your gender is: "+gender);
	}

}
