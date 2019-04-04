package day03;

public class d3star02 {

	public static void main(String[] args) {
		/* d3 별찍기 피라미드
			  + 마름모, 마름모 반전
		     * 		i=1 공=5 별=1
		    *** 	i=2 공=4 별=3
		   ***** 	i=3 공=3 별=5
		  ******* 	i=4 공=2 별=7
		 ********* 	i=5 공=1 별=9
		***********	i=6 공=0 별=11
		                             공=6-i *=2*i-1  
		*/
		
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
		
		/*
		     * 			i=1 추*=0
		    ** * 		i=2 추*=1
		   *** ** 		i=3 추*=2
		  **** *** 		i=4 추*=3
		 ***** **** 	i=5 추*=4
		****** *****	i=6 추*=5
		                                     추*=i-1           
		*/
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
