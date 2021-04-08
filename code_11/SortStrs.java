package code_11;

public class SortStrs {
	public static void main(String[] args) {
		String a[] = {"Java","Basic","C++","Fortran","SmallTalk"};
		for(int i = 0;i < a.length;i++) {
			for(int j = 0;j < a.length;j++) {
				if(a[j].compareTo(a[i]) < 0) {
					String temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		for(int i =0;i < a.length; i++) {
			System.out.println(" "+a[i]);
		}
	}

	
}
