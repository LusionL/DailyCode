package code_2;

public class breakloop {
	public static void main(String[] args) {
		for(int i = 0; i < 5 ; i++ ) {
			if(i==5) break;
			System.out.println("i: "+i);
		}
		System.out.println("Loop compelete.");
	}
}
