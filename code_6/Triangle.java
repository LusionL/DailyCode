package code_6;

public class Triangle extends Shape{
	private double a = 0;
	private double b = 0;
	private double c = 0;
	private double h = 0;
	public Triangle(double a,double h) {
		this.a = a;
		this.h = h;
	}
	public Triangle(double a,double b,double c) {
		this.a = a;
		this.b = b;
		this.c = c; 
	}
	public double getArea() {
		if(h == 0) {
			double s = (a+b+c)/2;
			return Math.pow(s*(s-a)*(s-b)*(s-c), 0.5);
			}else {
				return(a * h / 2);
			}
		
	}
}