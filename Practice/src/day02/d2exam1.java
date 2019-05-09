package day02;

public class d2exam1 {

	public static void main(String[] args) {
		/* d2 조건문 if
		 * if문 : ~ 하면, ~ 라면 (조건식)... 해라(실행문)
		 * 조건식 : 비교연산자, 논리연산자, 변수(참거짓 판별이 가능한 boolean)와 메소드
		 */
		
		boolean isEven = 10 % 2 == 0;
		System.out.println(isEven);
		
		//if를 이용하여 짝수 홀수 구별
		int num = 11;
		if (num % 2 == 0){
			System.out.println("짝수");
		}
		if (num % 2 == 1){
			System.out.println("홀수");
		}
		
		//if else를 이용하여 짝수 홀수 구별
		int num1 = 10;
		if (num1 % 2 == 0){
			System.out.println("짝수");
		}
		else{	//위의 모든 조건식이 거짓이면 아래와 같이 출력
			System.out.println("홀수");
		}
		
		//나이가 20 이상이면 성인이라고 출력하고 아니면 청소년 이라고 출력
		int num2 = 18;
		if (num2 >= 20){
			System.out.println("성인");
		}
		else {
			System.out.println("청소년");
		}
		
	}	
}
