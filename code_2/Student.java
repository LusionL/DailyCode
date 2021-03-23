package code_2;

public class Student {//定义类
	int no;
	String name;
	Student(int l_no,String l_name){//定义方法
		no = l_no;
		name = l_name;             
	}
	public static void main(String args[]) {
		Student S1 = new Student(1,"LZW");//使用方法
		Student S2 = new Student(2, "ZRX");
		System.out.println("Name is "+S1.name+", No is "+S1.no+".");
		System.out.println("Name is "+S2.name+", No is "+S2.no+".");
	}
}
