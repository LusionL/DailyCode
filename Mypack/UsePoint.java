package Mypack;
import Mypack.Point;
public class UsePoint {
	public static void main(String args[]) {
		Point p1 = new Point(1.0, 2.0);
		Point p2 = new Point(2.0,5.5);
		System.out.println("��p1���꣺"+p1.x+","+p1.y);
		System.out.println("��p2���꣺"+p2.x+","+p2.y);
		System.out.println("������룺"+p1.DistanceTO(p2));
	}
}
