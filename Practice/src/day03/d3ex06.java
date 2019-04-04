package day03;

public class d3ex06 {

	public static void main(String[] args) {
		//      *
		//     **
		//    ***
		//   ****
		//  *****
		// i가 1일때 공백이 5개 별이 1개
		// i가 2일때 공백이 4개 별이 2개
		// i가 3일때 공백이 3개 별이 3개
	
		int i, j;
		for(i=1 ; i<=6 ; i++){
			for(j=1 ; j<=6-i ; j++){
				System.out.print(" ");
			}
			for(j=1 ; j<=i ; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
