package code_2;

class Point {
	int x = 0;
	int y = 0;
	public int [] move(int dx,int dy){
		int ret[] = new int[2];
		ret[0] = x + dx;
		ret[1] = y + dy;
		return ret;
	}
	public void alert() {
		System.out.println("x="+x+" y="+y);
	}
	public static void main(String[] args) {
		Point a = new Point();
		a.x = 1;
		a.y = 2;
		a.move(10, 20);
		System.out.println("The output is "+ a.move(10, 20));
	}
}
