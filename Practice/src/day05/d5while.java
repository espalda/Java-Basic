package day05;

public class d5while {

	public static void main(String[] args) {
		/* d5 while문
		 * while문은 조건식 필수
		 * for와 while 문법적인 차이 
		 * 1.초기화;
		 * while(2.5.8 조건식){
		 *		3.6실행문;
		 *		4.7증감연산;}
		 * for(초기화;조건식;증감식){실행문}

		 * 무한루프
		 * for ( ; ; )
		 * while(true)
		 */
		
		int i=1, sum=0;
		while( i <= 10 ){//조건식 필수, 생략불가
			sum = sum+i;
			i++;
		}
		System.out.println(sum);
		
		
		int t =3;
		while( t-- > 0){
			System.out.println(t);
		}
	}

}
