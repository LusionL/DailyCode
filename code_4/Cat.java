package code_4;

public class Cat extends Animal{
	public String name = "Cat:è";
	public String str = "Cat:�ɰ���Сè";
	public static String staticName = "Dog:����è";
	
	public void eat() {
		System.out.println("Cat:�Է�");
	}
	
	public static void staticEat() {
		System.out.println("è�ڳԷ�");
	}
	
	public void eatMethod() {
		System.out.println("Cat:èϲ������");
	}
	
	public static void main(String[] args) {
		Animal animal = new Cat(); //��������ָ��������� ����ת��
		Cat cat = (Cat)animal; //�������ָ�������� ����ת��
		System.out.println(animal.name);
		System.out.println(animal.staticName);
		animal.eat();
		animal.staticEat();
		System.out.println(cat.str);
		cat.eatMethod();
	}
}