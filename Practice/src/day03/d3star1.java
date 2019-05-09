package day03;

public class d3star1 {

	public static void main(String[] args) {
		/* d3 반복문 별찍기
		
		****** i=1 별=6
		****** i=2 별=6
		****** i=3 별=6
		****** i=4 별=6
		****** i=5 별=6
		****** i=6 별=6
		*/
		int i, j;
		
		for(i=1; i<=6; i++){
			for(j=1; j<=6; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		/*
		*		i=1
		**		i=2
		***		i=3
		****	i=4
		*****	i=5
		******	i=6
		*/
			for(i=1; i<=6; i++){
				for(j=1; j<=i; j++){
					System.out.print("*");
				}
				System.out.println();
			}
		
		/*
			  * i=1 공=5
			 ** i=2 공=4
			*** i=3 공=3
		   **** i=4 공=2
		  ***** i=5 공=1
		 ****** i=6 공=0
		 */
			for(i=1; i<=6; i++){
				for(j=1; j<=6-i; j++){
					System.out.print(" ");
				}
				for(j=1; j<=i; j++){
					System.out.print("*");
				}
				System.out.println();
			}
			
			
	}
}


