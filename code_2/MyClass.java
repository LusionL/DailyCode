package code_2;

class MyClass {
	static int statInt = 4;
	static double statDouble = 16.0;
	int instInt;
	double instDouble;
	public static void staticMethod() {
		System.out.println("statInt="+statInt+"; statdouble="+statDouble);
	}
	public void instMethod() {
		System.out.println("instInt="+instInt+"; instDouble="+instDouble);
	}
	public  MyClass(int intArg,double doubleArg) {
		instInt = intArg;
		instDouble = doubleArg;
	}
	public static void changestatic(int newInt,double newDouble) {
		statInt = newInt;
		statDouble = newDouble;
	}
	public static void main(String args[]) {
		MyClass instance1 = new MyClass(1,2.0);
		MyClass instance2 = new MyClass(3,4.0);
		instance1.instMethod();     //ʵ���ķ�������
		instance2.instMethod();     //ʵ���ķ�������
		MyClass.staticMethod();     //��̬�ķ�������
		instance1.staticMethod();   //��̬�ķ�������
		instance2.staticMethod();   //��̬�ķ�������
		instance1.changestatic(8, 8.0);
		instance1.staticMethod();   //��̬�ķ�������
		instance2.staticMethod();   //��̬�ķ�������
		MyClass.staticMethod();
	}
}
