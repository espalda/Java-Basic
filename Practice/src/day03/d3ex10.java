package day03;

public class d3ex10 {

	public static void main(String[] args) {
		// *********
		//  *******
		//   *****
		//    ***
		//     *

		/* i가 5이면 공백이 0이고 별이 9개
		 * i가 4이면 공백이 1이고 별이 7개
		 * i가 3이면 공백이 2이고 별이 5개
		 * i가 2이면 공백이 3이고 별이 3개
		 * i가 1이면 공백이 4이고 별이 1개
		 * 
		 * 공=i-1 *=2*(5+1-i)-1
		 * 별의 갯수 =2*(6-i)-1
		 * 별의 갯수 = num-i	
		 */

		
		//for(i=num; i>=1 ; i--)
		//for(j=1 ; j<=num-i ; j++)
		//for(j=1 ; j<=2*i-1 ; j++)
		
		//방법01
		int i, j;
		for(i=1 ; i<=6 ; i++){
			for(j=1 ; j<=i-1; j++){
				System.out.print(" ");
			}
			for(j=1 ; j<=6-i ; j++){
				System.out.print("*");
			}
			for(j=1 ; j<=5-i ; j++){
				System.out.print("*");
			}
				System.out.println();
		}
		
		//방법02
		for(i=1 ; i<=8 ; i++){
			for(j=1 ; j<=i-1; j++){
				System.out.print(" ");
			}
			for(j=9 ; j>=2*i-1 ; j--){
				System.out.print("*");
			}
				System.out.println();
		}
		
		//방법03
		int num = 5;
		for(i=1; i<=num; i++){
			for(j=1 ; j<=i-1 ; j++){
				System.out.print(" ");
			}
			for(j=1 ; j<=2*(num-i)+1 ; j++ ){
				System.out.print("*");
			}
			System.out.println();
		}
		
		//방법04
		for(i=num; i>=1;i--){
			for(j=1 ; j<=num-i ; j++){
				System.out.print(" ");
			}
			for(j=1 ; j<=2*i-1 ; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		//방법05
		for(i=1 ; i<=num ; i++){
			for(j=1 ; j<=i-1 ; j++){
				System.out.print(" ");
			}
			for (j=1 ; j<=2*(num-i)+1 ; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		

		
		
		
	}

}
