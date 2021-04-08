package code_4;

public class Cat extends Animal{
	public String name = "Cat:猫";
	public String str = "Cat:可爱的小猫";
	public static String staticName = "Dog:我是猫";
	
	public void eat() {
		System.out.println("Cat:吃饭");
	}
	
	public static void staticEat() {
		System.out.println("猫在吃饭");
	}
	
	public void eatMethod() {
		System.out.println("Cat:猫喜欢吃鱼");
	}
	
	public static void main(String[] args) {
		Animal animal = new Cat(); //父类引用指向子类对象 向上转型
		Cat cat = (Cat)animal; //子类对象指向父类引用 向下转型
		System.out.println(animal.name);
		System.out.println(animal.staticName);
		animal.eat();
		animal.staticEat();
		System.out.println(cat.str);
		cat.eatMethod();
	}
}