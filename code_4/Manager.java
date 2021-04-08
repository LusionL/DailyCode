package code_4;

class Manager extends Employee{
	//public String department;
	public String department;
	public String getDetails() {
		System.out.println("I am Manager");
		return super.getDetails();
	}
	Manager(){
		super();   //���ʸ��๹�췽��
		department = "sale";
	}
}