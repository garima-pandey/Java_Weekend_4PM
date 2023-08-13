package OOPS;

class Enemy {
	private String name;
	private boolean weapon;
	static int counter;
	
	public Enemy(String name, boolean weapon) {
		this.name = name;
		this.weapon = weapon;
		counter++; // 0 + 1 = 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		System.out.println("Enemy Created "+counter); // 1
	}
}

public class StaticKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 10; i++)
		{
			Enemy obj = new Enemy("E"+i, true);
		}
	}
}
