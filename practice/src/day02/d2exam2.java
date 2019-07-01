package day02;

public class d2exam2 {

	public static void main(String[] args) {
		/* d2 조건문 if 순서
		 * num 2의 배수이면 2의 배수라고 출력
		 * num 3의 배수이면 3의 배수하고 출력
		 * num가 6의 배수이면 6의 배수라고 출력
		 * num가 2,3,5의 배수가 아니면 2,3,6의 배수가 아닙니다 출력
		 * 조건문의 순서 중요
		 */
		
		int num = 6;
		if (num % 6 == 0){
			System.out.println("6의 배수");	
		}
		
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
