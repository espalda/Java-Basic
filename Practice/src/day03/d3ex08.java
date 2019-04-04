package day03;

public class d3ex08 {

	public static void main(String[] args) {
		// *******
		// *****
		// ***
		// **
		// *
		// i가 1일때 별이 7개
		// i가 2일때 별이 6개
		int i, j;
		for (i=1 ; i<=7 ; i++){
			for(j=1 ; j<=7-i ; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
