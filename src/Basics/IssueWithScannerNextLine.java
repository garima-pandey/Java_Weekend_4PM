package Basics;

import java.util.Scanner;

public class IssueWithScannerNextLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("Enter your name");
		String name = sc.nextLine();
		
		System.out.println("Age: "+age + " Name: "+name);
	}

}
