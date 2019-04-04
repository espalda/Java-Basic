package day05;

public class d5ex02 {

	public static void main(String[] args) {
		/* d5 while문
		 * for(1 초기화; 2.5.8 조건식; 4.7 증감연산){
		 *		3.6 실행문;
		 * }
		 * for와 while 문법적인 차이, while문은 조건식 필수
		 * 1 초기화;
		 * while(2.5.8 조건식){
		 *		3.6실행문;
		 *		4.7증감연산;
		 * }

		 * 무한루프
		 * for ( ; ; )
		 * while(true)
		 */
		
		int i, sum;
		i=1;
		sum=0;
		while( i<=10 ){//조건식 필수, 생략불가
			sum = sum+i;
			i++;
		}
		System.out.println(sum);
		
		
	}

}
