package Basics;

import java.util.Scanner;

public class NextvsNextLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = sc.nextLine(); // enter - terminate
//		String name = sc.next(); // space - terminate
		
		System.out.println(name);
	}
}
