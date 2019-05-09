package day03;

public class d3star3 {

	public static void main(String[] args) {
		/* d3 반복문 별찍기
		
		******	i=1 별=6
		*****	i=2 별=5
		****	i=3 별=4
		***		i=4 별=3
		**		i=5 별=2
		*		i=6 별=1
		            별의 갯수=7-i=6+1-i=num+1-i
		*/
			int i, j;
			for (i=1 ; i<=7 ; i++){
				for(j=1 ; j<=7-i ; j++){
					System.out.print("*");
				}
				System.out.println();
			}
			
		/* 
		****** i=1 공=0 별=6
		 ***** i=2 공=1 별=5
		  **** i=3 공=2 별=4
		   *** i=4 공=3 별=3
		    ** i=5 공=4 별=2
		     * i=6 공=5 별=1
		      	별의 갯수 = 7-i = 6+1-i
		      	공=i-1 *=7-i=6+1-i=num+1-i
		 */
				for(i=1; i<=7; i++){
					for(j=1; j<=i-1; j++){
						System.out.print(" ");
					}
					for(j=1; j<=7-i; j++){
						System.out.print("*");
					}
					System.out.println();
				}
				
	}

}
