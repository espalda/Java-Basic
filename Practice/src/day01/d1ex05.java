package day01;

public class d1ex05 {

	public static void main(String[] args) {
		/* d1 연산자 종류
		 * 산술 : + - * / %, /과 %는 0으로 나눌수 없다
		 * 비교 : 크기비교, 조건식 (== 와 = 는 다름)
		 * 논리 : && ~하고, || ~하거나, !아니다 진리표, 조건식
		 * 대입 : = 을 기준으로 좌측에 변수명 1개만 와야한다
		 * 증감 : 하나씩 증가 ++, 하나씩 감소--
		 * 조건 : 연산자 위치에 따라 동작방식이 다르다
		 * 조건식 : 참 또는 거짓으로 결과가 나오는 식
		 */
		System.out.println(1 < 2);
		System.out.println(1 > 2);
		System.out.println(1 <= 2);
		System.out.println(1 >= 2);
		System.out.println(1 == 2);
		System.out.println(1 != 2);
		
		//비트논리는 특정 값, 논리는 참 또는 거짓
		//비트는 연산자 좌,우측에 변수가 나오고 논리는 좌,우에 조건식
		int num1 = 7;
		int num2 = 9;
		System.out.println(num1 & num2);
		
		/* 증감 연산자
		 * 증가 : 하나씩 증가 ++
		 * 감소 : 하나씩 감소--
		 * 전위형 : 증감을 하고 동작을 한다
		 * 후위형 : 동작을 하고 증감을 한다
		 */
		
		int num = 10;
		System.out.println("후위형 진행 : "+ num++);
		System.out.println("후위형 결과 : "+ num);
		//num = num + 1 = ++num, num++
		
		System.out.println("전위형 진행 : "+ ++num);
		System.out.println("전위형 결과 : "+ num);
		
	

	}

}
