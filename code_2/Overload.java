package code_2;

public class Overload {
	int sum(int x,int y) {
		return x+y;
	}
	int sum(int x,int y,int z) {
		return x+y+z;
	}
	public static void main(String args[]) {
		Overload c = new Overload();
		System.out.println("The first output is " + c.sum(10, 20)+".");
		System.out.println("The second output is "+c.sum(100, 200, 300)+".");
	}
	
}
