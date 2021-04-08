package code_3;

public class DataUser {
	public static void main(String[] args) {
		Date mydate = new Date();
		//mydate.day=21;  //day是private 不能直接访问
		//System.out.println("Day="+mydate.day);
		
		mydate.setDay(10);
		//System.out.println("Day="+ day);
	}
}
