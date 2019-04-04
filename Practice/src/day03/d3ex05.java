package day03;

public class d3ex05 {

	public static void main(String[] args) {
		// *
		// **
		// ***
		// ****
		// *****
		// i가 1일때 별이 1개
		// 1가 2일때 별이 2개
		
		int i = 0, j = 0;
		for(i=1 ; i<=5 ; i++){
			System.out.println("*****");}
			System.out.println();
			
			for(i=1; i<=5; i++){
				for(j=1 ; j<=i ; j++){
					System.out.print("*");
				}
				System.out.println();
			}
			
		
		
	}
}


