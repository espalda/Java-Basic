package day03;

public class d3ex07 {

	public static void main(String[] args) {
		//     *
		//    *** 
		//   *****
		//  *******
		// *********
		// 공백이 5개 이고 별이 1개 공백이 5개
		// 공백이 4개이고 별이 3개 이고 공백이 4개
		// 공백이 3개 이고 별이 5개 이고 공백이 3개
		
		//방법01
		int i, j;
		for(i=1 ; i<=5 ; i++){
			for(j=1 ; j<=5-i ; j++ ){
				System.out.print(" ");
			}
			for(j=1 ; j<=2*i-1 ; j++){
				System.out.print("*");
			}
				System.out.println();
		}
		
		//		 *
		//		**	**
		//     ***	***
		//	  ****	****
		//   *****  *****
		//방법02
		for(i=1 ; i<=5 ; i++){
			for(j=1 ; j<=5-i ; j++){
				System.out.print(" ");
			}
			for(j=1 ; j<=i ; j++){
				System.out.print("*");
			}
			for(j=1 ; j<=i-1 ; j++){
				System.out.print("*");
			}
				System.out.println();
			}
		

	}

}
