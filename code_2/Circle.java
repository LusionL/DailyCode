package code_2;

public class Circle {

		float x,y;
		float radius;
		double getArea() {
			return radius*radius*3.14;
		}
		double getCircum() {
			return 3.14*2*radius;
		}
		public static void main(String args[]) {
			Circle c = new Circle();
			c.radius = 3;
			c.x = 0;
			c.y = 0;
			System.out.println("Area of this circle is "+c.getArea());
			System.out.println("Circum of this circle is "+c.getCircum());
		}
}

                              

