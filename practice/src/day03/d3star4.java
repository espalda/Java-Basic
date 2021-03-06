package day03;

public class d3star4 {

	public static void main(String[] args) {
		/* d3 반복문 별찍기
		
		*********	i=5 공=0 *=9	5=>6-1
		 *******	i=4 공=1 *=7 4
		  *****		i=3 공=2 *=5 3
		   ***		i=2 공=3 *=3 2
		    *		i=1 공=4 *=1 1
					       공=num-i *=2*i-1
		 */

		//for(i=num; i>=1 ; i--)
		//for(j=1 ; j<=num-i ; j++)
		//for(j=1 ; j<=2*i-1 ; j++)
		
		//방법1
		int i, j;
		int num = 5;
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
		
		//방법2
		for(i=1 ; i<=9 ; i++){
			for(j=1 ; j<=i-1; j++){
				System.out.print(" ");
			}
			for(j=9 ; j>=2*i-1 ; j--){
				System.out.print("*");
			}
				System.out.println();
		}
		
		//방법3
		for(i=1; i<=num; i++){
			for(j=1 ; j<=i-1 ; j++){
				System.out.print(" ");
			}
			for(j=1 ; j<=2*(num-i)+1 ; j++ ){
				System.out.print("*");
			}
			System.out.println();
		}
		
		//방법4
		for(i=num; i>=1;i--){
			for(j=1 ; j<=num-i ; j++){
				System.out.print(" ");
			}
			for(j=1 ; j<=2*i-1 ; j++){
				System.out.print("*");
			}
			System.out.println();
		}

		
	}

}
