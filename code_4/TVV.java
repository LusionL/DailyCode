package code_4;

public class TVV {
	public static void main(String args[]) {
		AA a = new AA();
		BB b = new BB();
		AA c = new BB(); 
		a.callme();
		b.callme();
		c.callme(); 
	}
}
