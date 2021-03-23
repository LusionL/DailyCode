package code_2;

public class Ex3_2 {
	public static void main(String args[]) {
		 final int ARRAY_SIZE = 10;
		 int a[] = new int[ARRAY_SIZE];
		 int max = 0;
		 int index = 0;
		 for(int i = 0;i<a.length;i++) {
			 a[i] = (int)(Math.random()*10);
			 System.out.println(" "+a[i]);
		 }
		 max = a[0];
		 for(int j =1; j<ARRAY_SIZE; j++) {
			 if(max<a[j]) {
				 max = a[j];index=j;
			 }
		 }
		 System.out.println("Max value of this vector is "+max+". The index is "+index+".");
	}
}
