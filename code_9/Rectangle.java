package code_9;

public class Rectangle extends Shape{
	private double a = 0;
	private double b = 0;
	public Rectangle(double a,double b) {
		this.a = a;
		this.b = b;
	}
	public double CalcArea() {
		return a*b;
	}
}
