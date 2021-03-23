package Mypack;

public class Point {
	public double x,y;
	public Point(double a,double b) {
		x = a;
		y = b;
	}
	public double DistanceTO(Point p) {
		return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
	}
}
