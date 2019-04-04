package day03;

public class d3ex09 {

	public static void main(String[] args) {
		// ******
		//  *****
		//   ****
		//    ***
		//     **
		//      *
		// 별의 갯수 = 7-i = 6+1-i
		int i, j;
		for(i=1 ; i<=7 ; i++){
			for(j=1 ; j<=i-1 ; j++ ){
				System.out.print(" ");
			}
			for(j=1 ; j<=7-i ; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
