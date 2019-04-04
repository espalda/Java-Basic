package day02;

public class d2ex02 {

	public static void main(String[] args) {
		/* d2 if문의 순서
		 * 문제 : num 2의 배수이면 2의 배수라고 출력(2로 나누었을때 나머지가 0과 같다면 2의 배수라고 출력)
		 * 		num 3의 배수이면 3의 배수하고 출력
		 *		num가 6의 배수이면 6의 배수라고 출력
		 *		num가 2,3,5의 배수가 아니면 2,3,6의 배수가 아닙니다 출력
		 */
		
		int num = 6;
		// num % 2 == 0 && num % 3 != 0
		// 2의 배수이면서 3의 배수가 아닌것
		if (num % 6 == 0){
			System.out.println("6의 배수");	
		}
		// num % 3 == 0 && num % 2 != 0
		// 3의 배수이면서 2의 배수가 아닌것
		else if (num % 3 == 0){
			System.out.println("3의 배수");
		}
		else if (num % 2 == 0){
			System.out.println("2의 배수");
		}
		else {
			System.out.println("2,3,6의 배수가 아닙니다");
		}
		
		
	}

}
