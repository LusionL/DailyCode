package code_4;

class TV {
	public static void main(String args[]) {
		B bb,b = new B();
		A aa,a;
		a = (A)b;
		aa = b;

		System.out.println(a.s);
		System.out.println(aa.s);
		bb = (B)a;
		System.out.println(bb.s);
	}
}
