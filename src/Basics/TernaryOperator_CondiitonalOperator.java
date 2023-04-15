package Basics;

import java.util.Scanner;

public class TernaryOperator_CondiitonalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		? : - ternary operator
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int number = sc.nextInt();
		
//		if((number % 2) == 0)
//		{
//			System.out.println("Number is Even");
//		}
//		else {
//			System.out.println("Number is Odd");
//		}
		
//		Ternary - 3
//		
//		(condition) ? true : false;
		
		String result = ((number % 2) == 0) ? "Number is Even" : "Number is Odd";
		System.out.println(result);
	}

}
