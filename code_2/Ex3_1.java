package code_2;

public class Ex3_1 {
	public static void main(String args[]) {
		int sum = 0;
		int score[]= {75,69,50,98,45,98,52,68,56,90};
		int avg = 0;
		for(int i = 0; i<10 ; i++ ) {
			sum = sum + score[i];
		}
		avg = sum/10;
		System.out.println("The sum is "+sum+","+"The average is "+avg+".");
	}
}
