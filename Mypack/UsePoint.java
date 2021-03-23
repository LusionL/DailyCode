package Mypack;
import Mypack.Point;
public class UsePoint {
	public static void main(String args[]) {
		Point p1 = new Point(1.0, 2.0);
		Point p2 = new Point(2.0,5.5);
		System.out.println("点p1坐标："+p1.x+","+p1.y);
		System.out.println("点p2坐标："+p2.x+","+p2.y);
		System.out.println("两点距离："+p1.DistanceTO(p2));
	}
}
