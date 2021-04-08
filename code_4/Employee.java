package code_4;

class Employee {
	private String name;
	private int salary;
	public String getDetails() {
		return"Name:"+name+"\nSalary:"+salary;
	}
	Employee(){
		name = "Tom";
		salary = 1234;
	}
}
