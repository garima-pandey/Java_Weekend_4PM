package OOPS;

interface Print_ {
	int add(int a, int b);
}

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Lambda Expression
//		Print_ obj = (a, b) -> (a+b);
		Print_ obj = (int a, int b) -> (a+b);
		System.out.println(obj.add(10, 20));

	}

}
