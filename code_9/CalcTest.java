package code_9;

public class CalcTest {
	public static void main(String[] args) {
		Shape circle = new Circle(5);
		Shape triangle1 = new Rectangle(10, 5);
		Shape triangle2 = new Rectangle(8, 6);
		System.out.println("The area is "+triangle1.CalcArea());
		System.out.println("The area is "+triangle2.CalcArea());
		System.out.println("The area is "+circle.CalcArea());
	}
}
