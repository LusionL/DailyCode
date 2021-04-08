package code_9;

public class Circle extends Shape{
	private double r = 0;
	private final double PI = 3.14;
	public Circle(double r) {
		this.r = r;
	}
	public double CalcArea() {
		//double area = PI*r*r;
		//return area;
		return PI*r*r;
	}
}
