package code_2;

public class BreakLabel {
	public static void main(String[] args) {
		boolean t = true;
		first:{
			second:{
				third:{
					System.out.println("Before the break.");
//					if(t==true) break ;
//					if(t==true) break second;
					System.out.println("This won't excute1");
					if(t==true) break second;
				}
				System.out.println("This won't excute2");
			}
			System.out.println("This is after second block.");
		}
	}
}
