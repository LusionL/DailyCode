package code_8;

public class Test extends TT{
	public static void main(String args[]) {
		Test t = new Test("Tom");
	}
	public Test(String s) {
		super(s);
		System.out.println("How do you do?");
	}
	public Test() {
		this("I am Jack");
	}
}